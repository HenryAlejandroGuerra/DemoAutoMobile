package com.aut.demo.tigoSports.specs;

import com.aut.demo.tigoSports.steps.MenuSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CU_002_Browse_The_Menu {
    
    MenuSteps menu = new MenuSteps();
    
    @BeforeEach
    @Description("Open the Tigo Sports app and start a test")
    @Story("Login to Tigo Sports")
    void start(){
        menu.start();
    }
    
    @Description("Browse the entire menu")
    @Story("Browse the menu")
    @Test
    void browseMenu01(){
        menu.browseMenu();
    }
    
    @AfterEach
    @Description("Close Tigo Sports app")
    @Story("Logout Tigo Sports")
    void end(){
        menu.end();
    }
    
}
