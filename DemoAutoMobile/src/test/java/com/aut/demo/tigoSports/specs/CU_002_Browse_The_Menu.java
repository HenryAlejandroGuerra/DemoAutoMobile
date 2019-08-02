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
@Epic("CU 002 - Browse The Menu")
@Feature("Browse the entire menu")
public class CU_002_Browse_The_Menu {

    MenuSteps menu = new MenuSteps();
    
    @BeforeEach
    @Story("Login to Tigo Sports")
    @Description("Open the Tigo Sports app and start a test")
    void start(){
        menu.start();
    }
    
    @Test
    @DisplayName(value = "01 - Browse the menu")
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
    
}
