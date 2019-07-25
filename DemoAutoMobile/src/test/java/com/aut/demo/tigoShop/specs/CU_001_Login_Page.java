package com.aut.demo.tigoShop.specs;

import com.aut.demo.tigoShop.steps.HomeSteps;
import com.aut.demo.util.AllureReportCreation;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Flaky;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

@Epic("CU 001 - Login Page")
@Feature("Just enter the app")
public class CU_001_Login_Page {
    
    static AllureReportCreation allure = new AllureReportCreation();
    HomeSteps step = new HomeSteps();
    
    @BeforeAll
    static void clean(){
        allure.mvnClean();
    }

    @Test
    @Story("Just enter the app")
    @Description("Just enter the app")
    @Flaky
    void inPage(){
        step.start();
        step.inHome();
        step.end();
    }
    
    @AfterAll
    static void generateReport(){
        allure.mvnGenerateReport();
    }

}
