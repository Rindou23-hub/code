/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugas6;

/**
 *
 * @author user
 */
public class Tugas_6 {

    public static void main(String[] args) {
        // 1. Buat keranjang belanja
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // 2. Buat beberapa objek produk
        Product buku1 = new Buku("Pemrograman Java", 150000);
        Product elektronik1 = new Elektronik("Headphone Wireless", 750000);
        Product pakaian1 = new Pakaian("Kemeja Flanel", 250000);
        Product buku2 = new Buku("Basis Data", 125000);

        // 3. Tambahkan produk ke keranjang
        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(elektronik1);
        keranjang.tambahProduk(pakaian1);
        keranjang.tambahProduk(buku2);
        
        // 4. Tampilkan isi keranjang beserta detail harga dan diskon
        keranjang.tampilkanIsiKeranjang();

        // 5. Hitung dan tampilkan total harga setelah diskon
        double totalBelanja = keranjang.hitungTotalHargaSetelahDiskon();
        System.out.printf("\nTotal yang harus dibayar setelah diskon: Rp%,.2f%n", totalBelanja);
    }
}
