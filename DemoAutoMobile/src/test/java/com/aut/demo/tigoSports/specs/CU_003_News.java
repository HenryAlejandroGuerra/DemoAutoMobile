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

@Epic("CU 003 - News")
@Feature("Show all news")
public class CU_003_News {
    
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
    @Story("Show a random news")
    @Description("Show a random news in Tigo Sports")
    void news01(){
        menu.showRandomNews();
    }
    
    @Test
    @Story("Show a random news in the Home")
    @Description("Show a random news in home of Tigo Sports")
    void news02(){
        menu.showRandomNewsHome();
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
