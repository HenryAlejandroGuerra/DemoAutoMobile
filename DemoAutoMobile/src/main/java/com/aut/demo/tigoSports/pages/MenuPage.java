package com.aut.demo.tigoSports.pages;

import com.aut.demo.util.ToolsPage;
import org.openqa.selenium.By;

public class MenuPage extends ToolsPage {
    
    public static final By OPEN_MENU = By.xpath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
    public static final By HOME_TAB = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");
    public static final By CALENDAR_TAB = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]");
    public static final By VIDEOS_TAB = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]");
    public static final By NEWS_TAB = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]");
    public static final By STATS_TAB = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]");
    public static final By CONFG_TAB = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]");

    public MenuPage() {
    }
    
    public void menuTab(String menuTab){
        click(OPEN_MENU);
        timeWait(5);
        switch(menuTab){
            case "Home": click(HOME_TAB); break;
            case "Calendar": click(CALENDAR_TAB); break;
            case "Videos": click(VIDEOS_TAB); break;
            case "News": click(NEWS_TAB); break;
            case "Stats": click(STATS_TAB); break;
            case "Confg": click(CONFG_TAB); break;
        }
    }
    
    public HomePage homeTab(){
        timeWait(20);
        menuTab("Home");
        timeWait(10);
        return new HomePage();
    }
    
    public CalendarPage calendarTab(){
        timeWait(20);
        menuTab("Calendar");
        timeWait(10);
        return new CalendarPage();
    }
    
    public VideosPage videosTab(){
        timeWait(20);
        menuTab("Videos");
        timeWait(10);
        return new VideosPage();
    }
    
    public NewsPage noticeTab(){
        timeWait(20);
        menuTab("News");
        timeWait(10);
        return new NewsPage();
    }
    
}
