package com.aut.demo.allureReportUtils;

import com.aut.demo.utils.BasePage;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class AfterTestEach implements AfterTestExecutionCallback {

    AllureReport allure = new AllureReport();
    
    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        boolean testResult = context.getExecutionException().isPresent();
//        System.out.println("Test Result: "+testResult); //false - SUCCESS, true - FAILED
        if(testResult){
            allure.saveFailureScreenShot(BasePage.driver);
        }
    }
    
}
