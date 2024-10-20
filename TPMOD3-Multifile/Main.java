/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author main
 */

package com.mycompany.main;

public class Main {

    public static void main(String[] args) {
        
        //Buat dua buah objek Prodi pr1 dan pr2
        Prodi pr1 = new Prodi();
        Prodi pr2 = new Prodi();
        
        //Beri nilai untuk atribut dari masing masing objek pr dengan
        pr1.setNama("Informatika");
        pr2.setNama("Rekayasa Perangkat Lunak");
        
        //Buat dua buah objek Mahasiswa mhs1 dan mhs2
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        
        //Beri nilai untuk atribut dari masing-masing objek mhs dengan memanggil method setter
        mhs1.setNama("Heritsam Yuniawan");
        mhs1.setProdi(pr1);
        mhs2.setNama("Nugroho Rahmanto");
        mhs2.setProdi(pr2);
        
        //Tampilkan semua data objek Mahasiswa menggunakan method displayMahasiswa
        mhs1.displayMahasiswa();
        mhs2.displayMahasiswa();
    }
}
