package com.aut.demo.tigoShop.pages;

import com.aut.demo.util.ToolsPage;
import org.openqa.selenium.By;

public class ShopPage extends ToolsPage {
    
    private static final By back = By.id("com.juvomobileinc.tigoshop.sv:id/store_tbar_back_icon");
    private static final By mainBalance = By.id("com.juvomobileinc.tigoshop.sv:id/store_tbar_balance");
    private static final By promosTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.c[1]");
    private static final By internetTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.c[2]");
    private static final By callsSmsTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.c[3]");
    private static final By rechargeTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.c[4]");
    
    public ShopPage(){ 
    }
    
    public HomePage backHome(){
        click(back);
        timeWait(10);
        return new HomePage();
    }
    
    public ShopPage printBalance(){
        String balance = getText(mainBalance);
        System.out.println(balance);
        return this;
    }
    
    public ShopPage showOffers(){
        timeWait(10);
        click(internetTab);
        timeWait(5);
        scroll(1000);
        click(callsSmsTab);
        timeWait(5);
        scroll(1000);
        click(rechargeTab);
        timeWait(5);
        scroll(1000);
        return this;
    }
    
}
