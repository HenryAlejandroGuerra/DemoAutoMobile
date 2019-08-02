package com.aut.demo.tigoShop.specs;

import com.aut.demo.allureReportUtils.AfterTestAll;
import com.aut.demo.allureReportUtils.AfterTestEach;
import com.aut.demo.allureReportUtils.BeforeTestAll;
import com.aut.demo.tigoShop.steps.BalancesSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Flaky;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({BeforeTestAll.class, AfterTestEach.class, AfterTestAll.class})
@Epic("CU 002 - Show Balances")
@Feature("Show customer balance information")
@TestMethodOrder(OrderAnnotation.class)
public class CU_002_Show_Balances {
    
    BalancesSteps balance = new BalancesSteps();

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
    
    @Test
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
        balance.end();
    }
    
}
