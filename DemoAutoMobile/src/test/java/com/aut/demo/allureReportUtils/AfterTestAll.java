package com.aut.demo.allureReportUtils;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class AfterTestAll implements AfterAllCallback {
    
    AllureReport allure = new AllureReport();

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        String pathClass = context.getTestClass().get().toGenericString();
        System.out.println("get toGenericString: "+pathClass);
        String[] parts = pathClass.split(".");
        String app = parts[3];
        System.out.println("App: "+app);
        switch (app) {
            case "tigoBrowser": allure.mvnGenerateReport("Tigo Web El Salvador"); break;
            case "tigoShop": allure.mvnGenerateReport("Tigo Shop El Salvador"); break;
            case "tigoSports": allure.mvnGenerateReport("Tigo Sports El Salvador"); break;
            default: allure.mvnGenerateReport("Tigo"); break;
        }
    }
    
}
