package com.aut.demo.tigoBrowser.pages;

import com.aut.demo.util.ToolsPage;

public class HomePage extends ToolsPage {
    
    public HomePage() {
    }
    
    public HomePage scrollTest(){
        scrollWeb(300);
        timeWait(10);
        scrollUpWeb(300);
        timeWait(10);
        return this;
    }
    
}
