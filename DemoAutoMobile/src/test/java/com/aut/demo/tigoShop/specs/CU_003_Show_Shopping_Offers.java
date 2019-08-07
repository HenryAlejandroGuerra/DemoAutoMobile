package com.aut.demo.tigoShop.specs;

import com.aut.demo.allureReportUtils.AfterTestAll;
import com.aut.demo.allureReportUtils.AfterTestEach;
import com.aut.demo.allureReportUtils.BeforeTestAll;
import com.aut.demo.tigoShop.steps.ShopSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({BeforeTestAll.class, AfterTestEach.class, AfterTestAll.class})
@DisplayName(value = "Tigo Shop")
@Epic("CU 003 - Show Shopping Offers")
@Feature("Show customer Shopping Offers")
public class CU_003_Show_Shopping_Offers {

    ShopSteps shop = new ShopSteps();
    
    @BeforeEach
    @Story("Login to Tigo Shop")
    @Description("Open the Tigo Shop app and start a test")
    void start(){
        shop.start();
    }

    @Test
    @DisplayName(value = "01 - Show all offers")
    @Story("Show all offers in all tabs of the shopping tab")
    @Description("Show offers and promotions for calls, messages and internet")
    @Link(name = "More Offers", url = "https://www.tigo.com.sv/shop")
    void showShoppingOffers01(){
        shop.showShoppingOffersInAllTab();
    }

    @AfterEach
    @Story("Logout Tigo Shop")
    @Description("Close Tigo Shop app")
    void end(){
        shop.end();
    }
    
}
