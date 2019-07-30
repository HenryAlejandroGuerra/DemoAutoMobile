package com.aut.demo.tigoBrowser.pages;

import com.aut.demo.util.ToolsPage;
import org.openqa.selenium.By;

public class MenuPage extends ToolsPage {
    
    private static final By MENU = By.cssSelector("#block-block-3 > div > div > div.mobile-btn-wrapper");
    private static final By HOME =  By.xpath("//*[@id=\"block-menu-menu-main-menu-mobile\"]/div/div/ul/li[1]");
    private static final By POSPAGO = By.xpath("//*[@id=\"block-menu-menu-main-menu-mobile\"]/div/div/ul/li[2]");
    private static final By PREPAGO = By.xpath("//*[@id=\"block-menu-menu-main-menu-mobile\"]/div/div/ul/li[3]");
    private static final By PAQUETIGOS = By.xpath("//*[@id=\"block-menu-menu-main-menu-mobile\"]/div/div/ul/li[4]");

    public MenuPage() {
    }
    
    public MenuPage inHome(){
        timeWait(10);
        return this;
    }
    
    private void menuTab(String menuTab){
        click(MENU);
        timeWait(5);
        switch(menuTab){
            case "Home": click(HOME); break;
            case "Pospago": click(POSPAGO); break;
            case "Prepago": click(PREPAGO); break;
            case "Paquetigos": click(PAQUETIGOS); break;
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
    
    public PrepagoPage prepagoTab(){
        timeWait(10);
        menuTab("Prepago");
        timeWait(5);
        return new PrepagoPage();
    }
    
    public PaquetigosPage paquetigosTab(){
        timeWait(10);
        menuTab("Paquetigos");
        timeWait(5);
        return new PaquetigosPage();
    }
    
}
