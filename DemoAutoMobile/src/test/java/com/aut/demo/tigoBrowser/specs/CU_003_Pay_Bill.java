package com.aut.demo.tigoBrowser.specs;

import com.aut.demo.tigoBrowser.steps.HomeSteps;
import com.aut.demo.util.AllureReportCreation;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Epic("CU 003 - Pay Bill")
@Feature("Open the Tigo Web app and Pay the bills")
public class CU_003_Pay_Bill {

    static AllureReportCreation allure = new AllureReportCreation();
    HomeSteps home = new HomeSteps();
    
    @BeforeAll
    static void clean(){
        allure.mvnClean();
    }
    
    @BeforeEach
    @Story("Login to Tigo Web")
    @Description("Open the Tigo Web app and start a test")
    void start(){
        home.start();
    }
    
    @Test
    @Story("Pay the bills")
    @Description("Pay bills and enter mail")
    void payBills01(){
        home.payInvoice();
    }
    
    @AfterEach
    @Story("Logout Tigo Web")
    @Description("Close Tigo Web app")
    void end(){
        home.end();
    }
    
    @AfterAll
    static void generateReport(){
        allure.mvnGenerateReport("Tigo Web El Salvador");
    }
    
}
