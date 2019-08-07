package com.aut.demo.tigoBrowser.specs;

import com.aut.demo.allureReportUtils.AfterTestAll;
import com.aut.demo.allureReportUtils.AfterTestEach;
import com.aut.demo.allureReportUtils.BeforeTestAll;
import com.aut.demo.tigoBrowser.steps.HomeSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({BeforeTestAll.class, AfterTestEach.class, AfterTestAll.class})
@DisplayName(value = "Tigo Web")
@Epic("CU 003 - Pay Bill")
@Feature("Open the Tigo Web app and Pay the bills")
public class CU_003_Pay_Bill {

    HomeSteps home = new HomeSteps();
    
    @BeforeEach
    @Story("Login to Tigo Web")
    @Description("Open the Tigo Web app and start a test")
    void start(){
        home.start();
    }
    
    @Test
    @DisplayName(value = "01 - Pay the bills")
    @Story("Pay the bills")
    @Description("Pay bills and enter mail")
    void payBills01(){
        String email = JOptionPane.showInputDialog("Enter the phone number");
        home.payInvoice(email);
    }
    
    @AfterEach
    @Story("Logout Tigo Web")
    @Description("Close Tigo Web app")
    void end(){
        home.end();
    }
    
}
