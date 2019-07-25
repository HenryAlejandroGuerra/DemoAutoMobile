package com.aut.demo.tigoShop.steps;

import com.aut.demo.tigoShop.pages.HomePage;
import com.aut.demo.util.DriverFactory;
import java.net.MalformedURLException;
import io.qameta.allure.Step;

public class HomeSteps {

    DriverFactory factory = new DriverFactory();
    HomePage home = new HomePage();
    
    public HomeSteps(){
    }
    
    @Step("Login to Tigo Shop")
    public void start() {
        try {
            factory.setUpTigoShop();
        } catch (MalformedURLException ex) {
            System.out.println("Error MalformedURLException: "+ex);
        }
    }
    
    @Step("Finished Tigo Shop")
    public void end(){
        factory.tearDown();
    }
    
    @Step("Just enter the app")
    public void inHome(){
        home.inHome();
    }
    
}
