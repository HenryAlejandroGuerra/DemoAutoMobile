package com.aut.demo.tigoBrowser.pages;

import com.aut.demo.util.ToolsPage;
import org.openqa.selenium.By;

public class PospagoPage extends ToolsPage {
    
    private static final By btnCloseModal = By.xpath("//*[@id=\"liveForm\"]/div/div[2]/neb-form-footer/div/div[1]/div/div/div/div/button[1]");

    public PospagoPage() {
    }
    
    public MenuPage MenuTab(){
        return new MenuPage();
    }
    
    public void closeModal(){
        timeWait(30);
        click(btnCloseModal);
        timeWait(5);
    }
    
    public PospagoPage scrollTest(){
        closeModal();
        scrollWeb(1200);
        return this;
    }
    
}
