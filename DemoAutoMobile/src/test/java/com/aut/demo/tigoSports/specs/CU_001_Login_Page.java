package com.aut.demo.tigoSports.specs;

import com.aut.demo.tigoSports.steps.HomeSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

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
