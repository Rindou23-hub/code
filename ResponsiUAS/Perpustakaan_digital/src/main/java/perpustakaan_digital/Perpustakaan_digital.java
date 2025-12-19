/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package perpustakaan_digital;

/**
 *
 * @author user
 */
public class Perpustakaan_digital {
    public static void main(String[] args) {

        // Membuat objek
        Buku b1 = new Buku("B001", "Pemrograman Java", "James Gosling");
        Buku b2 = new Buku("B002", "Struktur Data", "Mark Allen");

        Anggota a1 = new Anggota("A001", "Kartika");

        // Agregasi
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahAnggota(a1);

        // Komposisi
        Peminjaman p = new Peminjaman(a1);
        p.tambahBuku(b1);
        p.tambahBuku(b2);

        p.pinjam();

        // Serialisasi
        perpustakaan.simpanData("perpustakaan.dat");

        Perpustakaan dataBaca = Perpustakaan.bacaData("perpustakaan.dat");
        dataBaca.tampilAnggota();
    }
}

