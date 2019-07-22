package com.aut.demo.util;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.offset.PointOption.point;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ToolsPage extends BasePage {
    
    public void timeWait(int seconds){
        int time = seconds * 1000;
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            System.out.println("InterruptedException in timeWait (ToolsPage): "+ex);
        }
    }
    
    public void click(By by){
        driver.findElement(by).click();
    }
    
    public String getText(By by){
        return driver.findElement(by).getText();
    }
    
    public void executeScript(String script){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(script);
    }
    
    public void scroll(int y){
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width / 2);
        // Swipe up to scroll down
        int startPoint = (int) (size.height - 10);
        int endPoint = (int) (startPoint - y);
    
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.longPress(point(anchor, startPoint)).moveTo(point(anchor, endPoint))
                .release().perform();
    }
    
    public void scrollUp(int y){
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width / 2);
        // Swipe up to scroll down
        int startPoint = (int) (size.height - 10);
        int endPoint = (int) (0 - y);
    
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.longPress(point(anchor, startPoint)).moveTo(point(anchor, endPoint))
                .release().perform();
    }
    
    public boolean exists(By by) {
        try {
            driver.findElement(by);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public void setText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    
    public void setKeyboard(By by, Keys key){
        driver.findElement(by).sendKeys(key);
    }
    
    public void scrollWeb(int y){
        executeScript("window.scrollBy(0,"+y+")");
    }
    
    public void scrollUpWeb(int y){
        executeScript("window.scrollBy(0,-"+y+")");
    }
    
}
