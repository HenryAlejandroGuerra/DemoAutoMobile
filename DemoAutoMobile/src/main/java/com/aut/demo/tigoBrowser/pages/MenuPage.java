package com.aut.demo.tigoBrowser.pages;

import com.aut.demo.util.ToolsPage;
import org.openqa.selenium.By;

public class MenuPage extends ToolsPage {
    
    private static final By menu = By.cssSelector("#block-block-3 > div > div > div.mobile-btn-wrapper");
    private static final By home =  By.cssSelector("#block-menu-menu-main-menu-mobile > div > div > ul > li.first.leaf.active-trail");
    private static final By pospago = By.cssSelector("#block-menu-menu-main-menu-mobile > div > div > ul > li:nth-child(2)");

    public MenuPage() {
    }
    
    public MenuPage inHome(){
        timeWait(10);
        return this;
    }
    
    public void menuTab(String menuTab){
        click(menu);
        timeWait(5);
        switch(menuTab){
            case "Home": click(home); break;
            case "Pospago": click(pospago); break;
        }
    }
    
    public HomePage homeTab(){
        timeWait(10);
        menuTab("Home");
        timeWait(5);
        return new HomePage();
    }
    
    public PospagoPage pospagoTab(){
        timeWait(10);
        menuTab("Pospago");
        timeWait(5);
        return new PospagoPage();
    }
    
}
