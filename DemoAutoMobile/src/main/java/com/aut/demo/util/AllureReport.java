package com.aut.demo.util;

import io.qameta.allure.Attachment;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class AllureReport {

    public AllureReport() {
    }
    
    public static String pathProject = System.getProperty("user.dir");

    public void mvnClean() {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "cd "+pathProject+" && mvn clean test");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while (true) {
                line = r.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error mvn clean test: "+e);
        }

    }
    
    public void mvnGenerateReport(String app) {
        try {
            setAllureEnvironment(app);
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "cd "+pathProject+" && mvn allure:report");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while (true) {
                line = r.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error mvn allure report: "+e);
        }

    }
    
    private void setAllureEnvironment(String app) {
        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
 
            // root element
            Element root = document.createElement("environment");
            root.appendChild(agregateParameter(document, "App", app));
            root.appendChild(agregateParameter(document, "Appium", "Server v.1.14.0"));
            root.appendChild(agregateParameter(document, "Android Emulator", "Android Virtual Devices of Android Studio"));
            root.appendChild(agregateParameter(document, "Allure Report", "2.12.1"));

            document.appendChild(root);
 
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(pathProject+"\\target\\allure-results\\environment.xml"));
 
            transformer.transform(domSource, streamResult);
 
            System.out.println("Done creating XML File");
 
        } catch (ParserConfigurationException | TransformerException pce) {
            System.out.println("Error setAllureEnvironment: "+pce);
        }
    }
    
    private Element agregateParameter(Document document, String key, String val){
        Element parameter = document.createElement("parameter");

        Element keyEl = document.createElement("key");
        keyEl.appendChild(document.createTextNode(key));
        parameter.appendChild(keyEl);

        Element valueEl = document.createElement("value");
        valueEl.appendChild(document.createTextNode(val));
        parameter.appendChild(valueEl);
        return parameter;
    }
    
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveFailureScreenShot(WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

}
