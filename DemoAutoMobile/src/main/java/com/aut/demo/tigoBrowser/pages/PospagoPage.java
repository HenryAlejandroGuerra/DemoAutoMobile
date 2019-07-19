package com.aut.demo.tigoBrowser.pages;

import com.aut.demo.util.ToolsPage;

public class PospagoPage extends ToolsPage {

    public PospagoPage() {
    }
    
    public PospagoPage scrollTest(){
        scroll(1200);
        scrollUp(1000);
        return this;
    }
    
}
