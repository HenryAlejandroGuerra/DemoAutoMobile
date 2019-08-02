package com.aut.demo.tigoBrowser.specs;

import com.aut.demo.allureReportUtils.AfterTestAll;
import com.aut.demo.allureReportUtils.AfterTestEach;
import com.aut.demo.allureReportUtils.BeforeTestAll;
import com.aut.demo.tigoBrowser.steps.HomeSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({BeforeTestAll.class, AfterTestEach.class, AfterTestAll.class})
@Epic("CU 003 - Pay Bill")
@Feature("Open the Tigo Web app and Pay the bills")
public class CU_003_Pay_Bill {

    HomeSteps home = new HomeSteps();
    
    @BeforeEach
    @Story("Login to Tigo Web")
    @Description("Open the Tigo Web app and start a test")
    void start(){
        home.start();
    }
    
    @Test
    @DisplayName(value = "01 - Pay the bills")
    @Story("Pay the bills")
    @Description("Pay bills and enter mail")
    void payBills01(){
        home.payInvoice("example@gmail.com");
//        allure.attachmentFile("JSON Attachment", "\\src\\test\\resources\\", "allure-json-file.", "json");
//        allure.attachmentFile("XML Attachment", "\\src\\test\\resources\\", "allure-xml-file.", "xml");
//        allure.attachmentFile("App Logo", "\\src\\test\\resources\\", "tigo-logo.", "jpg");
    }
    
    @AfterEach
    @Story("Logout Tigo Web")
    @Description("Close Tigo Web app")
    void end(){
        home.end();
    }
    
}
