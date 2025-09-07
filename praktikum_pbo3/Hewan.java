/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktikum_pbo3;

/**
 *
 * @author user
 */
public class Hewan {
    private String nama;
    private int umur;

    // Constructor
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur >= 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak boleh negatif.");
        }
    }

    // Method suara
    public void suara() {
        System.out.println(nama + " bersuara: \"Hewan bersuara\"");
    }

    // Method info
    public void info() {
        System.out.println("=== Informasi Hewan ===");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");
    }

    // Method berlari
    public void berlari() {
        System.out.println(nama + " sedang berlari.");
    }
}
