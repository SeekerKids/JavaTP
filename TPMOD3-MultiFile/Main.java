/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Kids1
 */
public class Main {

    public static void main(String[] args) {
        Prodi pr1 = new Prodi();
        Prodi pr2 = new Prodi();
        
        pr1.setNama("Informatika");
        pr2.setNama("Rekayasa Perangkat Lunak");
        
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        
        mhs1.setNama("Heritsam Yuniawan");
        mhs1.setProdi(pr1);
        mhs2.setNama("Nugroho Rahmanto");
        mhs2.setProdi(pr2);
        
        mhs1.displayMahasiswa();
        mhs2.displayMahasiswa();
    }
}
