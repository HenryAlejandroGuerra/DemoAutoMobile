package com.aut.demo.tigoShop.steps;

import com.aut.demo.tigoShop.pages.HomePage;
import com.aut.demo.util.DriverFactory;
import java.net.MalformedURLException;
import io.qameta.allure.Step;

public class BalancesSteps {
    
    DriverFactory factory = new DriverFactory();
    HomePage home = new HomePage();
    
    public BalancesSteps(){
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
    
    @Step("Into balance and Show all balance information")
    public void intoBalancesAndShowInformation(){
        home.balancesPage().showInformation();
    }
    
    @Step("Show the information available in the shopping tab")
    public void showBalanceInStoreTab(){
        home.shopPage().printBalance().backHome();
    }
    
}
