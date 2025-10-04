/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_pbo;

/**
 *
 * @author user
 */
// 3. Kelas Turunan dari Produk
public class Elektronik extends Produk {
    private int garansi; // dalam tahun

    public Elektronik(String namaProduk, int harga, int garansi) {
        // Memanggil constructor kelas induk (Produk)
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    // Override metode tampilkanInfo() untuk menambahkan info garansi
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + getNamaProduk());
        System.out.println("Harga: " + getHarga());
        System.out.println("Garansi: " + this.garansi + " tahun");
    }
}
