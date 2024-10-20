/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Mahasiswa
 */
public class Mahasiswa {
    private String nama;
    private Prodi prodi;
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    void setProdi(Prodi prodi){
        this.prodi = prodi;
    }
    
    String getNama(){
        return this.nama;
    }
    
    String getProdi(){
        return this.prodi.getNama();
    }
    
    void displayMahasiswa(){
       System.out.println("Nama Mahasiswa : " + this.getNama());
       System.out.println("Nama Prodi : " + this.getProdi());
       System.out.println();
    }
    
}
