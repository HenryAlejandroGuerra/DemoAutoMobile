package com.aut.demo.tigoSports.pages;

import com.aut.demo.util.ToolsPage;
import org.openqa.selenium.By;

public class MenuPage extends ToolsPage {
    
    public static final By openMenu = By.xpath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
    public static final By startTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");
    public static final By calendarTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]");
    public static final By videosTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]");
    public static final By newsTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]");
    public static final By statsTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]");
    public static final By configurationTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]");

    public MenuPage() {
    }
    
    public void menuTab(String menuTab){
        click(openMenu);
        timeWait(5);
        switch(menuTab){
            case "Home": click(startTab); break;
            case "Calendar": click(calendarTab); break;
            case "Videos": click(videosTab); break;
            case "News": click(newsTab); break;
            case "Stats": click(statsTab); break;
            case "Configuration": click(configurationTab); break;
        }
    }
    
    public HomePage homeTab(){
        timeWait(15);
        menuTab("Home");
        timeWait(10);
        return new HomePage();
    }
    
    public CalendarPage calendarTab(){
        timeWait(15);
        menuTab("Calendar");
        timeWait(10);
        return new CalendarPage();
    }
    
    public VideosPage videosTab(){
        timeWait(15);
        menuTab("Videos");
        timeWait(10);
        return new VideosPage();
    }
    
    public NewsPage noticeTab(){
        timeWait(15);
        menuTab("News");
        timeWait(10);
        return new NewsPage();
    }
    
}
