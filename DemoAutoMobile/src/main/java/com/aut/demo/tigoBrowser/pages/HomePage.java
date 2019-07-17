package com.aut.demo.tigoBrowser.pages;

import com.aut.demo.util.ToolsPage;

public class HomePage extends ToolsPage {

    public HomePage() {
    }
    
    public HomePage inHome(){
        timeWait(25);
        return this;
    }
    
}
