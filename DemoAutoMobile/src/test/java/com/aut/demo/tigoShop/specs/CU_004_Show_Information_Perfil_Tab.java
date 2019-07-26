package com.aut.demo.tigoShop.specs;

import com.aut.demo.tigoShop.steps.PerfilSteps;
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

@Epic("CU 004 - Show Information Perfil Tab")
@Feature("Show customer Perfil Information Tab")
public class CU_004_Show_Information_Perfil_Tab {

    static AllureReportCreation allure = new AllureReportCreation();
    PerfilSteps perfil = new PerfilSteps();
    
    @BeforeAll
    static void clean(){
        allure.mvnClean();
    }

    @BeforeEach
    @Story("Login to Tigo Shop")
    @Description("Open the Tigo Shop app and start a test")
    void start(){
        perfil.start();
    }

    @Test
    @Story("Show information in Perfil Tab")
    @Description("Show the user information from the profile tab")
    void showShoppingOffers01(){
        perfil.showInformation();
    }

    @AfterEach
    @Story("Logout Tigo Shop")
    @Description("Close Tigo Shop app")
    void end(){
        perfil.end();
    }
    
    @AfterAll
    static void generateReport(){
        allure.mvnGenerateReport();
    }
    
}
