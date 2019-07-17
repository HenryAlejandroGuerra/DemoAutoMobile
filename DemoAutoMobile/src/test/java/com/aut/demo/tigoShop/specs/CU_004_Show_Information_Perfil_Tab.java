package com.aut.demo.tigoShop.specs;

import com.aut.demo.tigoShop.steps.PerfilSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CU_004_Show_Information_Perfil_Tab {

    PerfilSteps perfil = new PerfilSteps();

    @BeforeEach
    @Description("Open the Tigo Shop app and start a test")
    @Story("Login to Tigo Shop")
    void start(){
        perfil.start();
    }

    @Description("Show the user information from the profile tab")
    @Story("Show information in Perfil Tab")
    @Test
    void showShoppingOffers01(){
        perfil.showInformation();
    }

    @AfterEach
    @Description("Close Tigo Shop app")
    @Story("Logout Tigo Shop")
    void end(){
        perfil.end();
    }
    
}
