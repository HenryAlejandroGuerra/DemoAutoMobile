package com.aut.demo.tigoShop.pages;

import com.aut.demo.utils.NotificationBar;
import com.aut.demo.utils.ToolsPage;
import org.openqa.selenium.By;

public class BalancesPage extends ToolsPage { 
    
    private static final By MY_NUMBER = By.id("com.juvomobileinc.tigoshop.sv:id/tbar_msisdn");
    private static final By REFRESH = By.id("com.juvomobileinc.tigoshop.sv:id/main_balance_header_refresh_icon");
    private static final By MAIN_BALANCE = By.id("com.juvomobileinc.tigoshop.sv:id/core_balance_internet_card_core_balance_text");
    private static final By INTERNET_AVAILABLE = By.id("com.juvomobileinc.tigoshop.sv:id/core_balance_internet_card_internet_amount_text");
    private static final String INTER_DETAILS = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout";
    private static final String INTER_INFO = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout";
    private static final String CALLS_DETAILS_DAYS = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout";
    private static final String CALLS_DETAILS_HOURS = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout";
    private static final String CALLS_INFO = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout";
    private static final String CALLS_VALIDITY = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout";
    private static final By ERROR_NOTIFICATION = By.id("com.juvomobileinc.tigoshop.sv:id/error_notification_text");

    public BalancesPage() {
    }
    
    NotificationBar notiBar = new NotificationBar();
    
    public HomePage returnHome(){
        return new HomePage();
    }
    
    public BalancesPage showInformation(){
        String number = getText(MY_NUMBER);
        String balance = getText(MAIN_BALANCE);
        String inter = getText(INTERNET_AVAILABLE);
        System.out.println("--- Bienvenido a Tigo ---");
        System.out.println("Su número es: "+number);
        System.out.println("Usted posee "+balance+" de Saldo principal y "+inter+" de internet disponible");
        scroll(1200);
        printAllInternet();
        scroll(1200);
        printAllCalls();
        return this;
    }
    
    private void printAllInternet(){
        try {
            int cont = 1;
            while (exists(By.xpath(INTER_DETAILS+"["+cont+"]/android.widget.LinearLayout/android.widget.TextView"))) {
                String available = getText(By.xpath(INTER_DETAILS+"["+cont+"]/android.widget.LinearLayout/android.widget.TextView"));
                String info = getText(By.xpath(INTER_INFO+"["+cont+"]/android.widget.TextView[2]"));
                System.out.println("Usted posee "+available+" de Internet con "+info);
                cont++;
            }
        } catch (Exception e) {
            System.out.println("Información de internet no disponible");
        }
    }
    
    private void printAllCalls(){
        try {
            int cont = 1;
            while (exists(By.xpath(CALLS_DETAILS_HOURS+"["+cont+"]/android.widget.LinearLayout"))) {
                String detailsHours;
                String detailsMinutes;
                String details;
                String[] detailsHour;
                String[] detailsMinute;

                if(exists(By.xpath(CALLS_DETAILS_DAYS+"["+cont+"]/android.widget.LinearLayout/android.widget.TextView[1]")) && exists(By.xpath(CALLS_DETAILS_HOURS+"["+cont+"]/android.widget.LinearLayout/android.widget.TextView[2]"))){
                    detailsHours = getText(By.xpath(CALLS_DETAILS_DAYS+"["+cont+"]/android.widget.LinearLayout/android.widget.TextView[1]"));
                    detailsMinutes = getText(By.xpath(CALLS_DETAILS_HOURS+"["+cont+"]/android.widget.LinearLayout/android.widget.TextView[2]"));

                    detailsHour = detailsHours.replaceAll("\\r", "").split("\\n");
                    detailsMinute = detailsMinutes.replaceAll("\\r", "").split("\\n");

                    details = detailsHour[0]+" "+detailsHour[1]+ " con "+detailsMinute[0]+" "+detailsMinute[1];
                } else {
                    detailsMinutes = getText(By.xpath(CALLS_DETAILS_HOURS+"["+cont+"]/android.widget.LinearLayout/android.widget.TextView"));
                    detailsMinute = detailsMinutes.replaceAll("\\r", "").split("\\n");
                    details = detailsMinute[0]+" "+detailsMinute[1];
                }

                String info = getText(By.xpath(CALLS_INFO+"["+cont+"]/android.widget.TextView[1]"));
                String available = getText(By.xpath(CALLS_VALIDITY+"["+cont+"]/android.widget.TextView[2]"));
                System.out.println("Usted posee "+details+" en llamadas para "+info+" con "+available);
                cont++;
            }
        } catch (Exception e) {
            System.out.println("Información de llamadas no disponible");
        }
    }
    
    public BalancesPage errorNotification(){
        // Turn Off or Turn On
        notiBar.wifi("Turn Off");
        timeWait(3);
        notiBar.mobileData("Turn Off");
        click(REFRESH);
        timeWait(5);
        String error = getText(ERROR_NOTIFICATION);
        System.out.println(error);
        timeWait(5);
        // Turn Off or Turn On
        notiBar.wifi("Turn On");
        timeWait(3);
        notiBar.mobileData("Turn On");
        return this;
    }
    
}
