/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas11;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private String namaPerpustakaan;
    private List<Buku> daftarBuku;
    
    public Perpustakaan(String nama) {
        this.namaPerpustakaan = nama;
        this.daftarBuku = new ArrayList<>();
    }
    
    public void tambahBuku(String judul, Pengarang pengarang) {
        Buku bukuBaru = new Buku(judul, pengarang);
        this.daftarBuku.add(bukuBaru);
        
        System.out.println("Judul Buku: " + judul + " telah ditambahkan ke " + this.namaPerpustakaan);
    }
    
    public void tampilkanSemuaBuku() {
        System.out.println("\n--- Daftar Buku di " + this.namaPerpustakaan + " ---");
        
        if (daftarBuku.isEmpty()) {
            System.out.println("Saat ini belum ada buku di perpustakaan.");
        } 
        else {
            for (Buku buku : daftarBuku) {
                buku.infoBuku();
                System.out.println("**************************");
            }
        }
    }
}
