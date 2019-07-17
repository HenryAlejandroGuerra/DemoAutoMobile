package com.aut.demo.tigoShop.pages;

import com.aut.demo.util.ToolsPage;
import org.openqa.selenium.By;

public class PerfilPage extends ToolsPage {
    
    private static final By back = By.id("com.juvomobileinc.tigoshop.sv:id/tbar_back_icon");
    private static final By myNumber = By.id("com.juvomobileinc.tigoshop.sv:id/profile_number");
    private static final By subscriptionDetails = By.id("com.juvomobileinc.tigoshop.sv:id/profile_content_layout");

    public PerfilPage() {
    }
    
    public HomePage backHome(){
        click(back);
        timeWait(10);
        return new HomePage();
    }
    
    public PerfilPage printInfo(){
        System.out.println("--- TIGO ---");
        System.out.println("Su información de Perfil es:");
        String number = getText(myNumber);
        System.out.println("Su número es "+number);
        String subs = getText(subscriptionDetails);
        System.out.println("Sus subscripciones:");
        System.out.println(subs);
        return this;
    }
    
}
