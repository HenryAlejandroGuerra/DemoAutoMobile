package com.aut.demo.tigoBrowser.specs;

import com.aut.demo.tigoBrowser.steps.MenuSteps;
import com.aut.demo.util.AllureReport;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("CU 002 - Show Information")
@Feature("Open the Tigo Web app and Show all information")
public class CU_002_Show_Information {
    
    static AllureReport allure = new AllureReport();
    MenuSteps menu = new MenuSteps();
    
    @BeforeAll
    static void clean(){
        allure.mvnClean();
    }
    
    @BeforeEach
    @Story("Login to Tigo Web")
    @Description("Open the Tigo Web app and start a test")
    void start(){
        menu.start();
    }
    
    @Test
    @DisplayName(value = "01 - Show all information")
    @Story("Show all information")
    @Description("Show all information")
    void showInformation01(){
        menu.navigateMenu();
    }
    
    @AfterEach
    @Story("Logout Tigo Web")
    @Description("Close Tigo Web app")
    void end(){
        menu.end();
    }
    
    @AfterAll
    static void generateReport(){
        allure.mvnGenerateReport("Tigo Web El Salvador");
    }
    
}
