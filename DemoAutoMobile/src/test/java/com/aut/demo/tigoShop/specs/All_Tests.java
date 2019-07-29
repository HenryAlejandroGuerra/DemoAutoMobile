package com.aut.demo.tigoShop.specs;

import com.aut.demo.tigoShop.steps.BalancesSteps;
import com.aut.demo.tigoShop.steps.PerfilSteps;
import com.aut.demo.tigoShop.steps.ShopSteps;
import com.aut.demo.util.AllureReportCreation;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Epic("All Tests")
@Feature("Show all test")
public class All_Tests {
    
    static AllureReportCreation allure = new AllureReportCreation();
    BalancesSteps balance = new BalancesSteps();
    ShopSteps shop = new ShopSteps();
    PerfilSteps perfil = new PerfilSteps();
    
    @BeforeAll
    static void clean(){
        allure.mvnClean();
    }
    
    @BeforeEach
    @Story("Login to Tigo Shop")
    @Description("Open the Tigo Shop app and start a test")
    void start(){
        balance.start();
    }
    
    @Test
    @Story("Show balance information")
    @Description("Show all balance information")
    @Severity(SeverityLevel.CRITICAL)
    void showBalances01(){
        balance.intoBalancesAndShowInformation();
    }
    
    @Test
    @Story("Show balance information in Shopping Tab")
    @Description("Show the information available in the shopping tab")
    @Owner("Person in charge of the test")
    void showBalances02(){
        balance.showBalanceInStoreTab();
    }
    
    @Test
    @Story("Show all offers in all tabs of the shopping tab")
    @Description("Show offers and promotions for calls, messages and internet")
    @Link(name = "More Offers", url = "https://www.tigo.com.sv/shop")
    void showShoppingOffers01(){
        shop.showShoppingOffersInAllTab();
    }
    
    @Test
    @Story("Show information in Perfil Tab")
    @Description("Show the user information from the profile tab")
    void showInformationPerfil01(){
        perfil.showInformation();
    }
    
    @AfterEach
    @Story("Logout Tigo Shop")
    @Description("Close Tigo Shop app")
    void end(){
        balance.end();
    }
    
    @AfterAll
    static void generateReport(){
        allure.mvnGenerateReport("Tigo Shop El Salvador");
    }
    
}
