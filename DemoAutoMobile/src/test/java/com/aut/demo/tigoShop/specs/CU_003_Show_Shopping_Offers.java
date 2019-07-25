package com.aut.demo.tigoShop.specs;

import com.aut.demo.tigoShop.steps.ShopSteps;
import com.aut.demo.util.AllureReportCreation;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Epic("CU 003 - Show Shopping Offers")
@Feature("Show customer Shopping Offers")
public class CU_003_Show_Shopping_Offers {

    static AllureReportCreation allure = new AllureReportCreation();
    ShopSteps shop = new ShopSteps();
    
    @BeforeAll
    static void clean(){
        allure.mvnClean();
    }
    
    @BeforeEach
    @Story("Login to Tigo Shop")
    @Description("Open the Tigo Shop app and start a test")
    @Severity(SeverityLevel.BLOCKER)
    void start(){
        shop.start();
    }

    @Test
    @Story("Show all offers in all tabs of the shopping tab")
    @Description("Show offers and promotions for calls, messages and internet")
    void showShoppingOffers01(){
        shop.showShoppingOffersInAllTab();
    }

    @AfterEach
    @Story("Logout Tigo Shop")
    @Description("Close Tigo Shop app")
    @Severity(SeverityLevel.CRITICAL)
    void end(){
        shop.end();
    }
    
    @AfterAll
    static void generateReport(){
        allure.mvnGenerateReport();
    }
    
}
