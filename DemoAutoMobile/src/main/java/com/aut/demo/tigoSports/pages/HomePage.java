package com.aut.demo.tigoSports.pages;

import static com.aut.demo.utils.BasePage.driver;
import com.aut.demo.utils.ToolsPage;
import io.appium.java_client.MobileElement;
import java.util.List;
import org.openqa.selenium.By;

public class HomePage extends ToolsPage {
    
    private static final By NEWS_IMAGE = By.id("sv.com.tigo.tigosports:id/image");
    private static final By BACK = By.xpath("//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]");

    public HomePage() {
    }
    
    public MenuPage menuTab(){
        return new MenuPage();
    }
    
    public HomePage inHome(){
        timeWait(25);
        return this;
    }
    
    public HomePage showRandomNews(){
        scrollLimited(1525);
        List<MobileElement> allNews = driver.findElements(NEWS_IMAGE);
//        System.out.println("News: "+allNews.size());
        int position = getRandomNumberInRange(0, allNews.size());
//        System.out.println("Position: "+position);
        allNews.get(position).click();
        timeWait(5);
        scrollLimited(1200);
        timeWait(10);
        scrollUpLimited(1200);
        click(BACK);
        return this;
    }
    
}
