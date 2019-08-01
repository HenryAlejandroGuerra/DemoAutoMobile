package com.aut.demo.tigoShop.specs;

import com.aut.demo.tigoShop.steps.BalancesSteps;
import com.aut.demo.util.AllureReport;
import com.aut.demo.util.BasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Flaky;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Epic("CU 002 - Show Balances")
@Feature("Show customer balance information")
public class CU_002_Show_Balances {
    
    static AllureReport allure = new AllureReport();
    BalancesSteps balance = new BalancesSteps();
    
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
    @Order(1)
    @DisplayName(value = "01 - Show balance information")
    @Story("Show balance information")
    @Description("Show all balance information")
    @Severity(SeverityLevel.CRITICAL)
    @Flaky
    void showBalances01(){
        balance.intoBalancesAndShowInformation();
    }
    
//    @Test
    @Order(2)
    @DisplayName(value = "02 - Show balance information in Shopping Tab")
    @Story("Show balance information in Shopping Tab")
    @Description("Show the information available in the shopping tab")
    void showBalances02(){
        balance.showBalanceInStoreTab();
    }
    
    @Test
    @Order(3)
    @DisplayName(value = "03 - Connection Error Notification")
    @Story("Connection Error Notification")
    @Description("Show the connection error in the balances tab")
    void showBalances03(){
        balance.errorConnection();
    }
    
    @AfterEach
    @Story("Logout Tigo Shop")
    @Description("Close Tigo Shop app")
    void end(){
        allure.saveFailureScreenShot(BasePage.driver);
        balance.end();
    }
    
    @AfterAll
    static void generateReport(){
        allure.mvnGenerateReport("Tigo Shop El Salvador");
    }
    
}
