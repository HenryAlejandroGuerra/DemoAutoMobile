package com.aut.demo.tigoShop.pages;

import com.aut.demo.util.ToolsPage;
import org.openqa.selenium.By;

public class HomePage extends ToolsPage {
    
    private static final By refresh = By.id("com.juvomobileinc.tigoshop.sv:id/main_balance_header_refresh_icon");
    private static final By shopPage = By.id("com.juvomobileinc.tigoshop.sv:id/home_store_floating_button");
    private static final By perfilPage = By.id("com.juvomobileinc.tigoshop.sv:id/tbar_profile_icon");
    private static final By helpPage = By.id("com.juvomobileinc.tigoshop.sv:id/tbar_help_icon");
    private static final By errorNotification = By.id("com.juvomobileinc.tigoshop.sv:id/error_notification_text");
    private static final By mainBalance = By.id("com.juvomobileinc.tigoshop.sv:id/core_balance_internet_card_core_balance_text");
    
    public HomePage(){  
    }
    
    public HomePage inHome(){
        timeWait(15);
        verifyError();
        return this;
    }
    
    public BalancesPage balancesPage(){
        timeWait(15);
        verifyError();
        return new BalancesPage();
    }
    
    public ShopPage shopPage(){
        timeWait(15);
        verifyError();
        click(shopPage);
        timeWait(10);
        return new ShopPage();
    }
    
    public PerfilPage perfilPage(){
        timeWait(15);
        verifyError();
        click(perfilPage);
        timeWait(10);
        return new PerfilPage();
    }
    
    public HelpPage helpPage(){
        timeWait(15);
        verifyError();
        click(helpPage);
        timeWait(10);
        return new HelpPage();
    }
    
    public void verifyError(){
        if(exists(errorNotification)){
            String error = getText(errorNotification);
            System.out.println(error);
            click(refresh);
            timeWait(15);
        }
    
        if(getText(mainBalance).equals("Actualiza para ver tu saldo principal")){
            System.out.println(getText(mainBalance));
            click(refresh);
            timeWait(15);
        }            
    }
    
}
