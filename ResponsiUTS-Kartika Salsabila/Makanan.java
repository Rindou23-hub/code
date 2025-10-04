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
public class Makanan extends Produk {
    private String tanggalKadaluarsa;

    public Makanan(String namaProduk, int harga, String tanggalKadaluarsa) {
        // Memanggil constructor kelas induk (Produk)
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    // Override metode tampilkanInfo() untuk menambahkan info tanggal kadaluarsa
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + getNamaProduk());
        System.out.println("Harga: " + getHarga());
        System.out.println("Tanggal Kadaluarsa: " + this.tanggalKadaluarsa);
    }
}
