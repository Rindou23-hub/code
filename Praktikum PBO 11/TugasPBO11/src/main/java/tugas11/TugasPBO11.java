/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugas11;

/**
 *
 * @author user
 */
public class TugasPBO11 {

    public static void main(String[] args) {
        // Membuat objek Pengarang
        Pengarang Karezu = new Pengarang("Karezu Hanayako");
        Pengarang Pramoedya = new Pengarang("Pramoedya Ananta Toer");
        Pengarang Imam = new Pengarang("Imam Adi Nata");
       
        // Membuat objek Perpustakaan 
        Perpustakaan literate = new Perpustakaan("Hyperion Library");

        // Menambahkan buku
        literate.tambahBuku("Hankazu", Karezu);
        literate.tambahBuku("Bumi Manusia", Pramoedya);
        literate.tambahBuku("Pemrograman Berorientasi Objek", Imam);

        // Menampilkan semua buku
        literate.tampilkanSemuaBuku();
    }
}
