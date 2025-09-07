/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktikum_pbo3;

/**
 *
 * @author user
 */
public class Mobil {
    // Atribut
    private String merk;
    private String model;
    private int tahun;
    private String warna;

    // Constructor
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // Getter dan Setter
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getTahun() { return tahun; }
    public void setTahun(int tahun) { this.tahun = tahun; }

    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }

    // Method untuk menyalakan mesin
    public void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala.");
    }

    // Method untuk menampilkan info mobil
    public void displayInfo() {
        System.out.println("=== Informasi Mobil ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Model : " + model);
        System.out.println("Tahun : " + tahun);
        System.out.println("Warna : " + warna);
    }

    // Method untuk mengubah warna mobil
    public void ubahWarna(String warnaBaru) {
        System.out.println("Mengubah warna mobil " + merk + 
                           " dari " + this.warna + 
                           " menjadi " + warnaBaru + "...");
        this.warna = warnaBaru;
    }
}