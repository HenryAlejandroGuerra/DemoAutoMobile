package com.aut.demo.tigoBrowser.steps;

import com.aut.demo.tigoBrowser.pages.HomePage;
import com.aut.demo.util.DriverFactory;
import io.qameta.allure.Step;
import java.net.MalformedURLException;

public class HomeSteps {
    
    DriverFactory factory = new DriverFactory();
    HomePage home = new HomePage();

    public HomeSteps() {
    }
    
    @Step("Login to Tigo Web")
    public void start() {
        try {
            factory.setUpTigoBrowser();
        } catch (MalformedURLException ex) {
            System.out.println("Error MalformedURLException: "+ex);
        }
    }
    
    @Step("Finished Tigo Web")
    public void end(){
        factory.tearDown();
    }
    
    @Step("Just enter the app")
    public void inHome(){
        home.inHome();
    }
    
}
