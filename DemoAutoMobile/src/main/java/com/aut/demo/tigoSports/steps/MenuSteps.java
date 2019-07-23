package com.aut.demo.tigoSports.steps;

import com.aut.demo.tigoSports.pages.MenuPage;
import com.aut.demo.util.DriverFactory;
import io.qameta.allure.Step;
import java.net.MalformedURLException;

public class MenuSteps {
    
    DriverFactory factory = new DriverFactory();
    MenuPage menu = new MenuPage();

    public MenuSteps() {
    }
    
    @Step("Login to Tigo Sports")
    public void start() {
        try {
            factory.setUpTigoSports();
        } catch (MalformedURLException ex) {
            System.out.println("Error MalformedURLException: "+ex);
        }
    }
    
    @Step("Finished Tigo Sports")
    public void end(){
        factory.tearDown();
    }
    
    @Step("Browse the entire menu")
    public void browseMenu(){
        menu.homeTab().menuTab().calendarTab().menuTab().videosTab().menuTab().noticeTab();
    }
    
    @Step("Show a random news")
    public void showRandomNews(){
        menu.noticeTab().showNewsRandom();
    }
    
    @Step("Show a random news in the Home")
    public void showRandomNewsHome(){
        menu.homeTab().showRandomNews();
    }
    
}
