package com.aut.demo.tigoBrowser.steps;

import com.aut.demo.tigoBrowser.pages.MenuPage;
import com.aut.demo.util.DriverFactory;
import io.qameta.allure.Step;
import java.net.MalformedURLException;

public class HomeSteps {
    
    DriverFactory factory = new DriverFactory();
    MenuPage menu = new MenuPage();

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
        menu.inHome();
    }
    
    @Step("Pay bills and enter mail \"{email}\"")
    public void payInvoice(String email){
        menu.homeTab().payBillByEmail(email);
    }
    
}
