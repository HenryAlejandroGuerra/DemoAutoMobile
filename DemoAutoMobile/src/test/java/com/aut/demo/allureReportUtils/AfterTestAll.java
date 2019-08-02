package com.aut.demo.allureReportUtils;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class AfterTestAll implements AfterAllCallback {
    
    AllureReport allure = new AllureReport();

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        String name = context.getDisplayName();
//        System.out.println("DisplayName: "+name);
        String app = name;
        switch (app) {
            case "Tigo Web": allure.mvnGenerateReport(app+" El Salvador"); break;
            case "Tigo Shop": allure.mvnGenerateReport(app+" El Salvador"); break;
            case "Tigo Sports": allure.mvnGenerateReport(app+" El Salvador"); break;
            default: allure.mvnGenerateReport("Tigo El Salvador"); break;
        }
    }
    
}
