package com.aut.demo.tigoSports.specs;

import com.aut.demo.allureReportUtils.AfterTestAll;
import com.aut.demo.allureReportUtils.AfterTestEach;
import com.aut.demo.allureReportUtils.BeforeTestAll;
import com.aut.demo.tigoSports.steps.MenuSteps;
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
@DisplayName(value = "Tigo Sports")
@Epic("CU 003 - News")
@Feature("Show all news")
public class CU_003_News {
    
    MenuSteps menu = new MenuSteps();
    
    @BeforeEach
    @Story("Login to Tigo Sports")
    @Description("Open the Tigo Sports app and start a test")
    void start(){
        menu.start();
    }
    
    @Test
    @DisplayName(value = "01 - Show a random news")
    @Story("Show a random news")
    @Description("Show a random news in Tigo Sports")
    void news01(){
        menu.showRandomNews();
    }
    
    @Test
    @DisplayName(value = "02 - Show a random news in the Home")
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
    
}
