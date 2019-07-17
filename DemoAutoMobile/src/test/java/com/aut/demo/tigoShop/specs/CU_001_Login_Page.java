package com.aut.demo.tigoShop.specs;

import com.aut.demo.tigoShop.steps.HomeSteps;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CU_001_Login_Page {
    
    HomeSteps step = new HomeSteps();
    
    @Description("Just enter the app")
    @Story("Just enter the app")
    @Test
    void inPage(){
        step.start();
        step.inHome();
        step.end();
    }

}
