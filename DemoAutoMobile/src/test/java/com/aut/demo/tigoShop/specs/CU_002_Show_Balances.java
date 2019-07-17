package com.aut.demo.tigoShop.specs;

import com.aut.demo.tigoShop.steps.BalancesSteps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CU_002_Show_Balances {
    
    BalancesSteps balance = new BalancesSteps();
    
    @BeforeEach
    @Description("Open the Tigo Shop app and start a test")
    @Story("Login to Tigo Shop")
    void start(){
        balance.start();
    }
    
    @Description("Show all balance information")
    @Story("Show balance information")
    @Test
    void showBalances01(){
        balance.intoBalancesAndShowInformation();
    }
    
    @Description("Show the information available in the shopping tab")
    @Story("Show balance information in Shopping Tab")
    @Test
    void showBalances02(){
        balance.showBalanceInStoreTab();
    }
    
    @AfterEach
    @Description("Close Tigo Shop app")
    @Story("Logout Tigo Shop")
    void end(){
        balance.end();
    }
    
}
