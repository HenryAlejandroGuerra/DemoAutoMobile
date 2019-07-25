package com.aut.demo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllureReportCreation {

    public AllureReportCreation() {
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
            System.out.println("Error mvn clean: "+e);
        }

    }
    
    public void mvnGenerateReport() {
        try {
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
            System.out.println("Error mvn generate report: "+e);
        }

    }

}
