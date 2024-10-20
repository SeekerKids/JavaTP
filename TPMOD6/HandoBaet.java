/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author HondaBaet
 */
public class HandoBaet extends SepedaMotor{
    public HandoBaet(String warnaMotor) {
        super(warnaMotor);
        this.ukuranTangki = 4; 
    }
    @Override
    public boolean jalan() {
        boolean berjalan = super.jalan();
        if (berjalan) {
            System.out.println("Motor Baet akan habis bensin pada " + cekKapanHabis());
        }
        return berjalan;
    }
}
