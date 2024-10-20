/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mahasiswa
 */

package com.mycompany.main;

public class Mahasiswa {
    private String nama;
    private Prodi prodi;
    
    //setter
    void setNama(String nama){
        this.nama = nama;
    }
    
    void setProdi(Prodi prodi){
        this.prodi = prodi;
    }
    
    //getter
    String getNama(){
        return this.nama;
    }
    
    //implementasi method getProdi dengan mengembalikan nama prodi dalam format String
    String getProdi(){
        return this.prodi.getNama();
    }
    
    //display
    void displayMahasiswa(){
       System.out.println("Nama Mahasiswa : " + this.getNama());
       System.out.println("Nama Prodi : " + this.getProdi());
       System.out.println();
    }
    
}
