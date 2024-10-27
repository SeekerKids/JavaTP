/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author WebPage
 */

public abstract class WebPage implements Loginable {
    
    private String webTitle;
    protected String loggedUsername;

    public WebPage(String title) {
        this.webTitle = title;
        this.loggedUsername = null;
    }

    protected void showHeader() {
        System.out.println("######################################");
        System.out.println("### " + webTitle + " ##");
        System.out.println("#---------------------------------------------##");
    }

    protected void showFooter() {
        System.out.println("#----------------------------------------------##");
        System.out.println("# Created by NamaPraktikan ##"); //isi sendiri gak usah manja
        System.out.println("######################################");
    }

    public void showFullPage() {
        showHeader();
        showMainPage();
        showFooter();
    }

    protected abstract void showMainPage();
}