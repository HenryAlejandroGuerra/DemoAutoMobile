package com.aut.demo.tigoShop.pages;

import com.aut.demo.utils.ToolsPage;
import org.openqa.selenium.By;

public class HomePage extends ToolsPage {
    
    private static final By REFRESH = By.id("com.juvomobileinc.tigoshop.sv:id/main_balance_header_refresh_icon");
    private static final By STORE_BTN = By.id("com.juvomobileinc.tigoshop.sv:id/home_store_floating_button");
    private static final By PERFIL_BTN = By.id("com.juvomobileinc.tigoshop.sv:id/tbar_profile_icon");
    private static final By HELP_BTN = By.id("com.juvomobileinc.tigoshop.sv:id/tbar_help_icon");
    private static final By ERROR_NOTIFICATION = By.id("com.juvomobileinc.tigoshop.sv:id/error_notification_text");
    private static final By MAIN_BALANCE = By.id("com.juvomobileinc.tigoshop.sv:id/core_balance_internet_card_core_balance_text");
    
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
        click(STORE_BTN);
        timeWait(10);
        return new ShopPage();
    }
    
    public PerfilPage perfilPage(){
        timeWait(15);
        verifyError();
        click(PERFIL_BTN);
        timeWait(10);
        return new PerfilPage();
    }
    
    public HelpPage helpPage(){
        timeWait(15);
        verifyError();
        click(HELP_BTN);
        timeWait(10);
        return new HelpPage();
    }
    
    private void verifyError(){
        if(exists(ERROR_NOTIFICATION)){
            String error = getText(ERROR_NOTIFICATION);
            System.out.println(error);
            click(REFRESH);
            timeWait(15);
        }
    
        if(getText(MAIN_BALANCE).equals("Actualiza para ver tu saldo principal")){
            System.out.println(getText(MAIN_BALANCE));
            click(REFRESH);
            timeWait(15);
        }            
    }
    
}
