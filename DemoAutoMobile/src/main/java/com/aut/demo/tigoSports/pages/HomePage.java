package com.aut.demo.tigoSports.pages;

import com.aut.demo.util.ToolsPage;

public class HomePage extends ToolsPage {

    public HomePage() {
    }
    
    public HomePage inHome(){
        timeWait(25);
        return this;
    }
    
    public MenuPage menuTab(){
        return new MenuPage();
    }
    
}
