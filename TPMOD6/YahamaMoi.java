/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author YahamaMoi
 */
public class YahamaMoi extends SepedaMotor {
    public YahamaMoi(String warnaMotor) {
        super(warnaMotor);
        this.ukuranTangki = 5; 
    }

    @Override
    public boolean jalan() {
        boolean berjalan = super.jalan();
        if (berjalan) {
            System.out.println("Bensin akan habis pada " + cekKapanHabis());
        }
        return berjalan;
    }
}
