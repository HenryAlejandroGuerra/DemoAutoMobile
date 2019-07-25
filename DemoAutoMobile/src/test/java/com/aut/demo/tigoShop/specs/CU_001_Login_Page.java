package com.aut.demo.tigoShop.specs;

import com.aut.demo.tigoShop.steps.HomeSteps;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Flaky;
import io.qameta.allure.Story;

@Epic("CU 001 - Login Page")
@Feature("Just enter the app")
public class CU_001_Login_Page {
    
    HomeSteps step = new HomeSteps();

    @Test
    @Story("Just enter the app")
    @Description("Just enter the app")
    @Flaky
    void inPage(){
        step.start();
        step.inHome();
        step.end();
    }

}
