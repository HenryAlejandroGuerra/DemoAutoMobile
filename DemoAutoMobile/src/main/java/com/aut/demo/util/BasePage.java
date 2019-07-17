package com.aut.demo.util;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    
    public static WebDriver driver;

    public BasePage(){
        driver = PageFactory.driver;
    }
    
}
