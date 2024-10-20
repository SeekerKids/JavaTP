/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author SepedaMotor
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SepedaMotor {
    private String warnaMotor;
    protected int ukuranTangki;
    private LocalDateTime waktuIsiBensin;
    
    public SepedaMotor(String warna) {
        this.warnaMotor = warna; 
        this.ukuranTangki = 3; 
        this.waktuIsiBensin = null; 
    }
    
    public void isiTangkiFull() {
        this.waktuIsiBensin = LocalDateTime.now(); 
        System.out.println("Waktu Saat ini: " + waktuIsiBensin.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
    
    public String cekKapanHabis() {
        LocalDateTime waktuHabis = waktuIsiBensin.plusHours(ukuranTangki); 
        return waktuHabis.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }
    
    public boolean jalan() {
        if (waktuIsiBensin == null) {
            System.out.println("Bensin habis, sepeda motor tidak dapat berjalan");
            return false;
        } else {
            System.out.println("Sepeda motor sedang berjalan");
            return true;
        }
    }
}
