/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

/**
 *
 * @author Main
 */
public class Main {
public static void main(String[] args) {
        SepedaMotor sp = new SepedaMotor("Hitam");
        HandoBaet hb = new HandoBaet("Biru");
        YahamaMoi ym = new YahamaMoi("Merah");
        System.out.println("Status awal SepedaMotor:");
        System.out.println(sp.jalan());
        System.out.println("Status awal HondaBaet:");
        System.out.println(hb.jalan());
        System.out.println("Status awal YahamaMoi:");
        System.out.println(ym.jalan());
        System.out.println("------------------------------");
        System.out.println("Status Terbaru Sepeda Motor:");        
        sp.isiTangkiFull();
        sp.jalan();
        System.out.println(sp.cekKapanHabis());
        System.out.println("Status Terbaru HandoBaet:");
        hb.isiTangkiFull();
        hb.jalan();
        System.out.println("Status Terbaru YahamaMoi:");
        ym.isiTangkiFull();
        ym.jalan();
        
    }
}
