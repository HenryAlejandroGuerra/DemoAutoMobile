package com.aut.demo.tigoShop.specs;

import com.aut.demo.allureReportUtils.AfterTestAll;
import com.aut.demo.allureReportUtils.AfterTestEach;
import com.aut.demo.allureReportUtils.BeforeTestAll;
import com.aut.demo.tigoShop.steps.HomeSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Flaky;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({BeforeTestAll.class, AfterTestEach.class, AfterTestAll.class})
@DisplayName(value = "Tigo Shop")
@Epic("CU 001 - Login Page")
@Feature("Install the app and log in with the phone number")
public class CU_001_Login_Page {
    
    HomeSteps step = new HomeSteps();
    
    @BeforeEach
    @Story("Login to Tigo Shop")
    @Description("Open the Tigo Shop app and start a test")
    void start(){
        step.start();
    }
    
    @Test
    @Order(1)
    @DisplayName(value = "01 - In the Page")
    @Story("Just enter the app")
    @Description("Just enter the app")
    @Severity(SeverityLevel.CRITICAL)
    @Flaky
    void inPage(){        
        step.inHome();
    }
    
    @Test
    @Order(2)
    @DisplayName(value = "02 - Log in with the phone number")
    @Story("Log in with the phone number")
    @Description("Log in with the phone number and verify the security code")
    void loginTigoShop(){
        String numberPhone = JOptionPane.showInputDialog("Enter the phone number");
        step.LoginWithThePhoneNumber(numberPhone);
    }
    
    @AfterEach
    @Story("Logout Tigo Shop")
    @Description("Close Tigo Shop app")
    void end(){
        step.end();
    }

}
