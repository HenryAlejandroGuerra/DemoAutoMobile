package com.aut.demo.tigoShop.pages;

import com.aut.demo.utils.ToolsPage;
import org.openqa.selenium.By;

public class ShopPage extends ToolsPage {
    
    private static final By BACK = By.id("com.juvomobileinc.tigoshop.sv:id/store_tbar_back_icon");
    private static final By MAIN_BALANCE = By.id("com.juvomobileinc.tigoshop.sv:id/store_tbar_balance");
    private static final By PROMOS_TAB = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.c[1]");
    private static final By INTER_TAB = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.c[2]");
    private static final By CALLS_SMS_TAB = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.c[3]");
    private static final By RECHARGE_TAB = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.c[4]");
    
    public ShopPage(){ 
    }
    
    public HomePage backHome(){
        click(BACK);
        timeWait(10);
        return new HomePage();
    }
    
    public ShopPage printBalance(){
        String balance = getText(MAIN_BALANCE);
        System.out.println(balance);
        return this;
    }
    
    public ShopPage showOffers(){
        timeWait(10);
        click(INTER_TAB);
        timeWait(5);
        scroll(1000);
        click(CALLS_SMS_TAB);
        timeWait(5);
        scroll(1000);
        click(RECHARGE_TAB);
        timeWait(5);
        scroll(1000);
        return this;
    }
    
}
