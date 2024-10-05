/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author main tp4
 */
public class Main {

    public static void main(String[] args) {
        Dokter dt1 = new Dokter("Maulana Malik", "Mata");
        Dokter dt2 = new Dokter("Fahryan Tresno", "Gigi");
        Dokter dt3 = new Dokter("Priyagung Makmur", "Telinga");

        Pasien ps1 = new Pasien("Adli Bahri", 20);
        Pasien ps2 = new Pasien("Adam Rafif", 55);
        Pasien ps3 = new Pasien("Alif Taufiq", 37);

        Pemesanan[] listPemesanan = new Pemesanan[5];
        listPemesanan[0] = new Pemesanan(dt1, ps1, "Selasa");
        listPemesanan[1] = new Pemesanan(dt2, ps1, "Kamis");
        listPemesanan[2] = new Pemesanan(dt2, ps2, "Selasa");
        listPemesanan[3] = new Pemesanan(dt3, ps2, "Jumat");
        listPemesanan[4] = new Pemesanan(dt1, ps3, "Senin");

        for (int i = 0; i < listPemesanan.length; i++) {
            Pemesanan p = listPemesanan[i];
            System.out.println("Urutan ke-" + (i+1));
            System.out.println("Nama Dokter   : " + p.getDokter().getNama());
            System.out.println("Spesialis     : " + p.getDokter().getSpesialis());
            System.out.println("Nama Pasien   : " + p.getPasien().getNama() + " (" + p.getPasien().getUmur() + ")");
            System.out.println("Hari          : " + p.getHari());
            System.out.println();
        }
    }
}
