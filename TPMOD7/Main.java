/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

/**
 *
 * @author main
 */

public class Main {

public static void main(String[] args) {
        System.out.println("=== Testing HomePage ===");
        HomePage homePage = new HomePage("Home Page");
        homePage.showFullPage();

        homePage.login("Username"); //isi sendiri gak usah manja
        homePage.showFullPage(); 

        System.out.println("\n=== Testing DashboardPage ===");
        DashboardPage dashboardPage = new DashboardPage("Dashboard Page");
        dashboardPage.showFullPage(); 

        dashboardPage.login("Username");  //isi sendiri gak usah manja
        dashboardPage.showFullPage(); 
    }

}
