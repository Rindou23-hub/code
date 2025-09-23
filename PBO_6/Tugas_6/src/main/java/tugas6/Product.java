/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author user
 */
public abstract class Product {
    protected String nama;
    protected double harga;

    public Product(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Metode abstrak untuk menghitung diskon
    // Setiap kelas turunan WAJIB mengimplementasikan metode ini
    public abstract double hitungDiskon();
    
    public double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
    }
}
