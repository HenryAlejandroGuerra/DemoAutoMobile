package com.aut.demo.utils;

import org.openqa.selenium.WebDriver;

public class PageFactory extends org.openqa.selenium.support.PageFactory {
    
    public static WebDriver driver;
    public static com.aut.demo.tigoShop.pages.HomePage homeTigoShop;
    public static com.aut.demo.tigoSports.pages.HomePage homeTigoSport;
    public static com.aut.demo.tigoBrowser.pages.HomePage homeTigoWeb;
    
    public PageFactory(){
    }

    public void init(){
        driver = DriverFactory.getDriver();

        homeTigoShop = PageFactory.initElements(driver, com.aut.demo.tigoShop.pages.HomePage.class);
        homeTigoSport = PageFactory.initElements(driver, com.aut.demo.tigoSports.pages.HomePage.class);
        homeTigoWeb = PageFactory.initElements(driver, com.aut.demo.tigoBrowser.pages.HomePage.class);
    }
    
}
