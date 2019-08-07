package com.aut.demo.tigoShop.pages;

import com.aut.demo.utils.ToolsPage;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;

public class LoginPage extends ToolsPage {
    
    public static final By LOGIN_BTN = By.id("com.juvomobileinc.tigoshop.sv:id/splash_login_button");
    public static final By SELECT_COUNTRY = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button");
    public static final By INPUT_NUMBER = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.EditText");
    public static final By CONTINUE_BTN = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button");
    public static final By INPUT_CODE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.widget.EditText");
    public static final By CODE_CONTINUE_BTN = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button");
    public static final By STORE_BTN = By.id("com.juvomobileinc.tigoshop.sv:id/home_store_floating_button");

    public LoginPage() {
    }
    
    public HomePage returnHome(){
        return new HomePage();
    }
    
    public LoginPage LoginTigoShop(String numberPhone){
        click(LOGIN_BTN);
        timeWait(10);
        click(INPUT_NUMBER);
        setText(INPUT_NUMBER, numberPhone);
        click(CONTINUE_BTN);
        timeWait(10);
        click(INPUT_CODE);
        String code = JOptionPane.showInputDialog("Enter the verification code");
        setText(INPUT_CODE, code);
        click(CODE_CONTINUE_BTN);
        timeWait(10);
        return this;
    }
    
}
