package com.aut.demo.allureReportUtils;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class BeforeTestAll implements BeforeAllCallback {

    AllureReport allure = new AllureReport();
    
    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        allure.mvnClean();
    }
    
}
