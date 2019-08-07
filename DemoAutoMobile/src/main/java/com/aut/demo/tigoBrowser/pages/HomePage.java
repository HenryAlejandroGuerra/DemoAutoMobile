package com.aut.demo.tigoBrowser.pages;

import com.aut.demo.allureReportUtils.AllureReport;
import com.aut.demo.utils.ToolsPage;
import org.openqa.selenium.By;

public class HomePage extends ToolsPage {
    
    private static final By PAY_BILL_TAB = By.cssSelector("#block-bean-setlists-mobile-front > div > div > div > div > div > div > div:nth-child(1)");
    private static final By PAY_BILL_OPTION = By.cssSelector("#cont-principal > a:nth-child(3) > div");
    private static final By PAY_BILL_EMAIL = By.cssSelector("#edit-email");
    
    AllureReport allure = new AllureReport();
    
    public HomePage() {
    }
    
    public MenuPage MenuTab(){
        return new MenuPage();
    }
    
    public HomePage payBillByEmail(String email){
        timeWait(10);
        click(PAY_BILL_TAB);
        timeWait(8);
        click(PAY_BILL_OPTION);
        timeWait(8);
        click(PAY_BILL_EMAIL);
        timeWait(3);
        setText(PAY_BILL_EMAIL, email);
        timeWait(5);
        androidBack();
        timeWait(5);
        androidBack();
        timeWait(5);
        attachFilesToTheReport();
        return this;
    }
    
    private void attachFilesToTheReport(){
        allure.attachmentFile("JSON Attachment", "\\src\\test\\resources\\", "allure-json-file.", "json");
        allure.attachmentFile("XML Attachment", "\\src\\test\\resources\\", "allure-xml-file.", "xml");
        allure.attachmentFile("App Logo", "\\src\\test\\resources\\", "tigo-logo.", "jpg");
    }
    
}
