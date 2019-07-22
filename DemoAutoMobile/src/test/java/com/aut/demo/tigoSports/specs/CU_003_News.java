package com.aut.demo.tigoSports.specs;

import com.aut.demo.tigoSports.steps.MenuSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CU_003_News {
    
    MenuSteps menu = new MenuSteps();
    
    @BeforeEach
    @Description("Open the Tigo Sports app and start a test")
    @Story("Login to Tigo Sports")
    void start(){
        menu.start();
    }
    
    @Description("Show a random news in Tigo Sports")
    @Story("Show a random news")
    @Test
    void news01(){
        menu.showRandomNews();
    }
    
    @AfterEach
    @Description("Close Tigo Sports app")
    @Story("Logout Tigo Sports")
    void end(){
        menu.end();
    }
    
}
