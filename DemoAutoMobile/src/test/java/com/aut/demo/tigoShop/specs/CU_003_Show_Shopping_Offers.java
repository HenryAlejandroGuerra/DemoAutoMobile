package com.aut.demo.tigoShop.specs;

import com.aut.demo.tigoShop.steps.ShopSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CU_003_Show_Shopping_Offers {
    
    ShopSteps shop = new ShopSteps();
    
    @BeforeEach
    @Description("Open the Tigo Shop app and start a test")
    @Story("Login to Tigo Shop")
    public void start(){
        shop.start();
    }

    @Description("Show offers and promotions for calls, messages and internet")
    @Story("Show all offers in all tabs of the shopping tab")
    @Test
    public void showShoppingOffers01(){
        shop.showShoppingOffersInAllTab();
    }

    @AfterEach
    @Description("Close Tigo Shop app")
    @Story("Logout Tigo Shop")
    public void end(){
        shop.end();
    }
    
}
