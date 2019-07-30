package com.aut.demo.tigoSports.specs;

import com.aut.demo.tigoSports.steps.MenuSteps;
import com.aut.demo.util.AllureReport;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Epic("CU 002 - Browse The Menu")
@Feature("Browse the entire menu")
public class CU_002_Browse_The_Menu {

    static AllureReport allure = new AllureReport();
    MenuSteps menu = new MenuSteps();
    
    @BeforeAll
    static void clean(){
        allure.mvnClean();
    }
    
    @BeforeEach
    @Story("Login to Tigo Sports")
    @Description("Open the Tigo Sports app and start a test")
    void start(){
        menu.start();
    }
    
    @Test
    @Story("Browse the menu")
    @Description("Browse the entire menu")
    void browseMenu01(){
        menu.browseMenu();
    }
    
    @AfterEach
    @Story("Logout Tigo Sports")
    @Description("Close Tigo Sports app")
    void end(){
        menu.end();
    }
    
    @AfterAll
    static void generateReport(){
        allure.mvnGenerateReport("Tigo Sports El Salvador");
    }
    
}
