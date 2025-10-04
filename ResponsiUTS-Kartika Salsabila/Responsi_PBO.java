/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package responsi_pbo;

/**
 *
 * @author user
 */
public class Responsi_PBO {
    public static void main(String[] args) {
        
        System.out.println("1. Output Produk");
        // Membuat objek dari kelas turunan Elektronik
        Elektronik laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();
        
        System.out.println("\n2. Output Pegawai");
        // Membuat objek dari kelas turunan PegawaiTetap
        PegawaiTetap pegawai1 = new PegawaiTetap("Kartika", 5000000, 1000000);
        pegawai1.tampilkanInfo();

        System.out.println("\n3. Output Polimorfisme");
        
        // 4. Implementasi Polimorfisme
        // Referensi kelas induk (Produk) memegang objek dari kelas turunan (Makanan)
        Produk produkPolimorf = new Makanan("Snack", 15000, "2023-12-30");
        produkPolimorf.tampilkanInfo(); // Memanggil metode dari objek Makanan
        
        System.out.println(); // Memberi jarak
        
        // Referensi kelas induk (Pegawai) memegang objek dari kelas turunan (PegawaiKontrak)
        Pegawai pegawaiPolimorf = new PegawaiKontrak("Andi", 3000000, 12);
        pegawaiPolimorf.tampilkanInfo(); // Memanggil metode dari objek PegawaiKontrak
    }
}
