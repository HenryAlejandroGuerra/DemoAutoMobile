package com.aut.demo.tigoSports.pages;

import com.aut.demo.util.ToolsPage;

public class NewsPage extends ToolsPage {

    public NewsPage() {
    }
    
    public MenuPage menuTab(){
        return new MenuPage();
    }
    
    public NewsPage showNewsRandom(){
        timeWait(10);
        scrollLimited(1200);
        timeWait(10);
        scrollUpLimited(500);
        return this;
    }
    
}
