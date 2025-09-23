/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Product> daftarProduk;

    public KeranjangBelanja() {
        this.daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Product produk) {
        this.daftarProduk.add(produk);
        System.out.println(produk.getNama() + " telah ditambahkan ke keranjang.");
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Product produk : daftarProduk) {
            total += produk.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanIsiKeranjang() {
        System.out.println("\n--- Isi Keranjang Belanja ---");
        if (daftarProduk.isEmpty()) {
            System.out.println("Keranjang kosong.");
            return;
        }
        for (Product p : daftarProduk) {
            System.out.printf("Produk: %-20s | Harga Asli: Rp%,12.2f | Diskon: Rp%,10.2f | Harga Akhir: Rp%,12.2f%n",
                p.getNama(),
                p.getHarga(),
                p.hitungDiskon(),
                p.getHargaSetelahDiskon());
        }
        System.out.println("-----------------------------");
    }
}
