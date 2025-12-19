/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan_digital;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;

public class Peminjaman implements IPeminjaman {
    private Anggota anggota;
    private List<Buku> daftarBuku;

    public Peminjaman(Anggota anggota) {
        this.anggota = anggota;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    @Override
    public void pinjam() {
        System.out.println("Anggota " + anggota.getNama() + " meminjam:");
        for (Buku b : daftarBuku) {
            b.tampilInfo();
            System.out.println("------------------");
        }
    }

    @Override
    public void kembalikan() {
        daftarBuku.clear();
        System.out.println("Semua buku telah dikembalikan.");
    }
}

