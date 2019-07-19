package com.aut.demo.util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
    
    PageFactory factory = new PageFactory();
    static WebDriver driver;
    public static String device_name;
    public static String platform_name;
    public static String platform_version;
    public static String automation_name;
    public static String app;
    public static String appPackage;
    public static String appActivity;
    public static String browserName;
    public static String url_tigo;
    public static String new_command_timeout;
    public static String appium_host_url;
    public static String pathEnv = System.getProperty("user.dir");
    
    public DriverFactory(){
    }
    
    public void setUpTigoShop() throws MalformedURLException {
        getProperties();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, device_name);
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platform_name);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, platform_version);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, automation_name);
	cap.setCapability(MobileCapabilityType.APP, app);
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, new_command_timeout);
        cap.setCapability(MobileCapabilityType.NO_RESET, true);
        cap.setCapability("autoGrantPermissions", true);
        URL url = new URL(appium_host_url);
        
        driver = new AndroidDriver<MobileElement>(url, cap);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        factory.init();
        Set<String> contextNames = ((AppiumDriver<MobileElement>) driver).getContextHandles();
        for (String contextName : contextNames) {
           System.out.println(contextName);
        }
        System.out.println("Created Session Succesful");
    }
    
    public void setUpTigoSports() throws MalformedURLException {
        getProperties();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, device_name);
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platform_name);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, platform_version);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, automation_name);
	cap.setCapability("appPackage", appPackage);
        cap.setCapability("appActivity", appActivity);
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, new_command_timeout);
        cap.setCapability(MobileCapabilityType.NO_RESET, true);
//        cap.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
        cap.setCapability("autoGrantPermissions", true);
        URL url = new URL(appium_host_url);
        
        driver = new AndroidDriver<MobileElement>(url, cap);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        factory.init();
        Set<String> contextNames = ((AppiumDriver<MobileElement>) driver).getContextHandles();
        for (String contextName : contextNames) {
           System.out.println(contextName);
        }
        System.out.println("Created Session Succesful");
    }
    
    public void setUpTigoBrowser() throws MalformedURLException {
        getProperties();
        
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, device_name);
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platform_name);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, platform_version);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, automation_name);
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        cap.setCapability("chromedriverDisableBuildCheck", true);
        cap.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
//        cap.setCapability("appPackage", "com.android.chrome");
//        cap.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");
//        cap.setCapability(MobileCapabilityType.NO_RESET, true);
//        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, new_command_timeout);
//        cap.setCapability("chromeOptions", "{args: ['--disable-popup-blocking']}");
        URL url = new URL(appium_host_url);
        
        driver = new RemoteWebDriver(url, cap);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.get(url_tigo);

        System.out.println("Created Session Succesful");
    }
    
    public static WebDriver getDriver() {
        return driver;
    }
    
    public void getProperties(){
        try {
            InputStream input = new FileInputStream(pathEnv+"/env/default/appium.properties");

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // Get Appium Properties
            device_name = prop.getProperty("DEVICE_NAME");
            platform_name = prop.getProperty("PLATFORM_NAME");
            platform_version = prop.getProperty("PLATFORM_VERSION");
            automation_name = prop.getProperty("AUTOMATION_NAME");
            app = pathEnv+prop.getProperty("APP");
            appPackage = prop.getProperty("APP_PACKAGE");
            appActivity = prop.getProperty("APP_ACTIVITY");
            browserName = prop.getProperty("BROWSER_NAME");
            url_tigo = prop.getProperty("URL_TIGO");
            new_command_timeout = prop.getProperty("NEW_COMMAND_TIMEOUT");
            appium_host_url = prop.getProperty("APPIUM_HOST_URL");

        } catch (IOException ex) {
            System.out.println("Error en getProperties: "+ex);
        }
    }
    
    public void tearDown() {
        driver.quit();
        System.out.println("Finished Test");
    }
    
}
