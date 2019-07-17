package com.aut.demo.util;

import com.aut.demo.tigoShop.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class PageFactory extends org.openqa.selenium.support.PageFactory {
    
    public static WebDriver driver;
    public static HomePage homePage;
    
    public PageFactory(){
    }

    public void init(){
        driver = DriverFactory.getDriver();

        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    
}
