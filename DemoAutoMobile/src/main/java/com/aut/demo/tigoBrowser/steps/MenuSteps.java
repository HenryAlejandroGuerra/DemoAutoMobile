package com.aut.demo.tigoBrowser.steps;

import com.aut.demo.tigoBrowser.pages.MenuPage;
import com.aut.demo.util.DriverFactory;
import io.qameta.allure.Step;
import java.net.MalformedURLException;

public class MenuSteps {
    
    DriverFactory factory = new DriverFactory();
    MenuPage menu = new MenuPage();

    public MenuSteps() {
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
    
    @Step("Browse the Tigo menu")
    public void navigateMenu(){
        menu.pospagoTab().scrollTest();
    }
    
}
