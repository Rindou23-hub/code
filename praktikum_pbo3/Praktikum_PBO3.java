/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_pbo3;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Membuat 2 objek mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2018, "Putih");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2020, "Hitam");

        // Menampilkan info kedua mobil
        mobil1.displayInfo();
        mobil1.startEngine();
        System.out.println();

        mobil2.displayInfo();
        mobil2.startEngine();
        System.out.println();

        // Mengubah warna mobil1
        mobil1.ubahWarna("Merah");
        mobil1.displayInfo();
        System.out.println();

        // Update tahun mobil2
        mobil2.setTahun(2021);
        System.out.println("Setelah update tahun:");
        mobil2.displayInfo();
    }
}