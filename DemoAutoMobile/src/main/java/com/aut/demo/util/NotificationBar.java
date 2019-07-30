package com.aut.demo.util;

import org.openqa.selenium.By;

public class NotificationBar extends ToolsPage {
    
    private static final By WIFI_ON = By.xpath("//android.widget.Button[@content-desc=\"Wi-Fi activado,Señal de Wi-Fi excelente,AndroidWifi,Abrir configuración de Wi-Fi\"]");
    private static final By WIFI_OFF = By.xpath("//android.widget.Button[@content-desc=\"Wi-Fi desactivada,Abrir configuración de Wi-Fi\"]");
    private static final By BTN_POWER = By.id("android:id/toggle");
    private static final By DATA_ON = By.xpath("//android.widget.Button[@content-desc=\"Móvil Datos móviles activados. Dos barras de teléfono. Android.,Abrir configuración de Datos móviles\"]");
    private static final By DATA_OFF = By.xpath("//android.widget.Button[@content-desc=\"Móvil Datos móviles activados. Dos barras de teléfono. Android.,Abrir configuración de Datos móviles\"]");

    public NotificationBar() {
    }
    
    public void deployNotBar(){
        deployNotificationBar();
        timeWait(2);
        deployNotificationBar();
    }
    
    public void closeNotBar(){
        androidBack();
        androidBack();
    }
    
    public void wifi(String state){
        deployNotBar();
        timeWait(2);
        
        if(state.equals("Turn Off")){
            click(WIFI_ON);
            timeWait(2);
            click(BTN_POWER);
        } else {
            click(WIFI_OFF);
            timeWait(5);
        }
        
        closeNotBar();
    }
    
    public void mobileData(String state){
        deployNotBar();
        timeWait(2);
        
        if(state.equals("Turn Off")){
            click(DATA_ON);
            timeWait(2);
            click(BTN_POWER);
            androidBack();
        } else {
            click(DATA_OFF);
            timeWait(2);
            click(BTN_POWER);
            androidBack();
        }
        
        closeNotBar();
    }
    
}
