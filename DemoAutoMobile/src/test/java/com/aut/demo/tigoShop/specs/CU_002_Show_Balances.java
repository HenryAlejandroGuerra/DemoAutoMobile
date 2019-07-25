package com.aut.demo.tigoShop.specs;

import com.aut.demo.tigoShop.steps.BalancesSteps;
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

@Epic("CU 002 - Show Balances")
@Feature("Show customer balance information")
public class CU_002_Show_Balances {
    
    static AllureReportCreation allure = new AllureReportCreation();
    BalancesSteps balance = new BalancesSteps();
    
    @BeforeAll
    static void clean(){
        allure.mvnClean();
    }
    
    @BeforeEach
    @Story("Login to Tigo Shop")
    @Description("Open the Tigo Shop app and start a test")
    @Severity(SeverityLevel.BLOCKER)
    void start(){
        balance.start();
    }
    
    @Test
    @Story("Show balance information")
    @Description("Show all balance information")
    void showBalances01(){
        balance.intoBalancesAndShowInformation();
    }
    
    @Test
    @Story("Show balance information in Shopping Tab")
    @Description("Show the information available in the shopping tab")
    void showBalances02(){
        balance.showBalanceInStoreTab();
    }
    
    @AfterEach
    @Story("Logout Tigo Shop")
    @Description("Close Tigo Shop app")
    @Severity(SeverityLevel.CRITICAL)
    void end(){
        balance.end();
    }
    
    @AfterAll
    static void generateReport(){
        allure.mvnGenerateReport();
    }
    
}
