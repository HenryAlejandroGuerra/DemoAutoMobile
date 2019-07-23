package com.aut.demo.tigoShop.pages;

import com.aut.demo.util.ToolsPage;
import org.openqa.selenium.By;

public class PerfilPage extends ToolsPage {
    
    private static final By BACK = By.id("com.juvomobileinc.tigoshop.sv:id/tbar_back_icon");
    private static final By MY_NUMBER = By.id("com.juvomobileinc.tigoshop.sv:id/profile_number");
    private static final By SUBS_DETAILS = By.id("com.juvomobileinc.tigoshop.sv:id/profile_content_layout");

    public PerfilPage() {
    }
    
    public HomePage backHome(){
        click(BACK);
        timeWait(10);
        return new HomePage();
    }
    
    public PerfilPage printInfo(){
        System.out.println("--- TIGO ---");
        System.out.println("Su información de Perfil es:");
        String number = getText(MY_NUMBER);
        System.out.println("Su número es "+number);
        String subs = getText(SUBS_DETAILS);
        System.out.println("Sus subscripciones:");
        System.out.println(subs);
        return this;
    }
    
}
