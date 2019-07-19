package com.aut.demo.tigoBrowser.specs;

import com.aut.demo.tigoBrowser.steps.MenuSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CU_002_Show_Information {
    
    MenuSteps menu = new MenuSteps();
    
    @BeforeEach
    @Description("Open the Tigo Web app and start a test")
    @Story("Login to Tigo Web")
    void start(){
        menu.start();
    }
    
    @Description("Show all information")
    @Story("Show all information")
    @Test
    void showInformation01(){
        menu.navigateMenu();
    }
    
    @AfterEach
    @Description("Close Tigo Web app")
    @Story("Logout Tigo Web")
    void end(){
        menu.end();
    }
    
}
