package com.aut.demo.tigoBrowser.pages;

import com.aut.demo.util.ToolsPage;
import org.openqa.selenium.By;

public class HomePage extends ToolsPage {
    
    private static final By PAY_BILL_TAB = By.cssSelector("#block-bean-setlists-mobile-front > div > div > div > div > div > div > div:nth-child(1)");
    private static final By PAY_BILL_OPTION = By.cssSelector("#cont-principal > a:nth-child(3) > div");
    private static final By PAY_BILL_EMAIL = By.cssSelector("#edit-email");
    
    public HomePage() {
    }
    
    public MenuPage MenuTab(){
        return new MenuPage();
    }
    
    public HomePage payBillByEmail(){
        timeWait(10);
        click(PAY_BILL_TAB);
        timeWait(8);
        click(PAY_BILL_OPTION);
        timeWait(8);
        click(PAY_BILL_EMAIL);
        timeWait(3);
        setText(PAY_BILL_EMAIL, "example@gmail.com");
        timeWait(5);
        androidBack();
        timeWait(5);
        androidBack();
        timeWait(5);
        return this;
    }
    
}
