/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_pbo;

/**
 *
 * @author user
 */
public class Produk {
    // 2. Enkapsulasi dengan akses modifier private
    private String namaProduk;
    private int harga;

    // Constructor
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Metode Getter dan Setter
    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Metode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + this.namaProduk);
        System.out.println("Harga: " + this.harga);
    }
}