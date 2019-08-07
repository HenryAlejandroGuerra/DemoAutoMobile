package com.aut.demo.tigoSports.specs;

import com.aut.demo.allureReportUtils.AfterTestAll;
import com.aut.demo.allureReportUtils.AfterTestEach;
import com.aut.demo.allureReportUtils.BeforeTestAll;
import com.aut.demo.tigoSports.steps.HomeSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Flaky;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({BeforeTestAll.class, AfterTestEach.class, AfterTestAll.class})
@DisplayName(value = "Tigo Sports")
@Epic("CU 001 - Login Page")
@Feature("Just enter the app")
public class CU_001_Login_Page {

    HomeSteps step = new HomeSteps();
    
    @Test
    @DisplayName(value = "01 - In the Page")
    @Story("Just enter the app")
    @Description("Just enter the app")
    @Flaky
    void inPage(){
        step.start();
        step.inHome();
        step.end();
    }
    
}
