package com.aut.demo.tigoShop.pages;

import com.aut.demo.util.ToolsPage;
import org.openqa.selenium.By;

public class BalancesPage extends ToolsPage { 
    
    private static final By myNumber = By.id("com.juvomobileinc.tigoshop.sv:id/tbar_msisdn");
    private static final By refresh = By.id("com.juvomobileinc.tigoshop.sv:id/main_balance_header_refresh_icon");
    private static final By shopPage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout");
    private static final By perfilPage = By.id("com.juvomobileinc.tigoshop.sv:id/tbar_profile_icon");
    private static final By helpPage = By.id("com.juvomobileinc.tigoshop.sv:id/tbar_help_icon");
    private static final By mainBalance = By.id("com.juvomobileinc.tigoshop.sv:id/core_balance_internet_card_core_balance_text");
    private static final By internetAvailable = By.id("com.juvomobileinc.tigoshop.sv:id/core_balance_internet_card_internet_amount_text");
    private static final String internetDetails = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout";
    private static final String internetInfo = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout";
    private static final String callsDetailsHour = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout";
    private static final String callsDetailsMinutes = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout";
    private static final String callsInfo = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout";
    private static final String callsValidity = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout";

    public BalancesPage() {
    }
    
    public BalancesPage showInformation(){
        String number = getText(myNumber);
        String balance = getText(mainBalance);
        String inter = getText(internetAvailable);
        System.out.println("--- Bienvenido a Tigo ---");
        System.out.println("Su número es: "+number);
        System.out.println("Usted posee "+balance+" de Saldo principal y "+inter+" de internet disponible");
        scroll(1200);
        printAllInternet();
        scroll(1200);
        printAllCalls();
        return this;
    }
    
    public void printAllInternet(){
        try {
            int cont = 1;
            while (exists(By.xpath(internetDetails+"["+cont+"]/android.widget.LinearLayout/android.widget.TextView"))) {
                String available = getText(By.xpath(internetDetails+"["+cont+"]/android.widget.LinearLayout/android.widget.TextView"));
                String info = getText(By.xpath(internetInfo+"["+cont+"]/android.widget.TextView[2]"));
                System.out.println("Usted posee "+available+" de Internet con "+info);
                cont++;
            }
        } catch (Exception e) {
            System.out.println("Información de internet no disponible");
        }
    }
    
    public void printAllCalls(){
        try {
            int cont = 1;
            while (exists(By.xpath(callsDetailsMinutes+"["+cont+"]/android.widget.LinearLayout"))) {
                String detailsHours;
                String detailsMinutes;
                String details;
                String[] detailsHour;
                String[] detailsMinute;

                if(exists(By.xpath(callsDetailsHour+"["+cont+"]/android.widget.LinearLayout/android.widget.TextView[1]")) && exists(By.xpath(callsDetailsMinutes+"["+cont+"]/android.widget.LinearLayout/android.widget.TextView[2]"))){
                    detailsHours = getText(By.xpath(callsDetailsHour+"["+cont+"]/android.widget.LinearLayout/android.widget.TextView[1]"));
                    detailsMinutes = getText(By.xpath(callsDetailsMinutes+"["+cont+"]/android.widget.LinearLayout/android.widget.TextView[2]"));

                    detailsHour = detailsHours.replaceAll("\\r", "").split("\\n");
                    detailsMinute = detailsMinutes.replaceAll("\\r", "").split("\\n");

                    details = detailsHour[0]+" "+detailsHour[1]+ " con "+detailsMinute[0]+" "+detailsMinute[1];
                } else {
                    detailsMinutes = getText(By.xpath(callsDetailsMinutes+"["+cont+"]/android.widget.LinearLayout/android.widget.TextView"));
                    detailsMinute = detailsMinutes.replaceAll("\\r", "").split("\\n");
                    details = detailsMinute[0]+" "+detailsMinute[1];
                }

                String info = getText(By.xpath(callsInfo+"["+cont+"]/android.widget.TextView[1]"));
                String available = getText(By.xpath(callsValidity+"["+cont+"]/android.widget.TextView[2]"));
                System.out.println("Usted posee "+details+" en llamadas para "+info+" con "+available);
                cont++;
            }
        } catch (Exception e) {
            System.out.println("Información de llamadas no disponible");
        }
    }
    
}
