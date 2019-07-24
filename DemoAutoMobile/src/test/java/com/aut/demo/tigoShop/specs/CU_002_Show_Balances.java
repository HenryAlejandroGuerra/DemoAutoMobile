package com.aut.demo.tigoShop.specs;

import com.aut.demo.tigoShop.steps.BalancesSteps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Flaky;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("CU 002 - Show Balances")
@Feature("Show customer balance information")
public class CU_002_Show_Balances {
    
    BalancesSteps balance = new BalancesSteps();
    
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
    @Flaky
    void showBalances01(){
        balance.intoBalancesAndShowInformation();
    }
    
    @Test
    @Story("Show balance information in Shopping Tab")
    @Description("Show the information available in the shopping tab")
    @Flaky
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
    
}
