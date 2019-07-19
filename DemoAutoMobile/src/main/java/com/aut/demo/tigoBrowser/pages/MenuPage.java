package com.aut.demo.tigoBrowser.pages;

import com.aut.demo.util.ToolsPage;
import org.openqa.selenium.By;

public class MenuPage extends ToolsPage {
    
    private static final By menu = By.id("mobile-menu-btn");
    private static final By home =  By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[1]/android.view.View");
    private static final By pospago = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View");

    public MenuPage() {
    }
    
    public MenuPage inHome(){
        timeWait(10);
        return this;
    }
    
    public void menuTab(String menuTab){
        timeWait(10);
        System.out.println("Llegó aquí");
        click(menu);
        timeWait(5);
        switch(menuTab){
            case "Home": click(home); break;
            case "Pospago": click(pospago); break;
        }
    }
    
    public HomePage homeTab(){
        menuTab("Home");
        return new HomePage();
    }
    
    public PospagoPage pospagoTab(){
        menuTab("Pospago");
        return new PospagoPage();
    }
    
}
