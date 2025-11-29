/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugas12;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Tugas_Modul12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fileTxt = "buku.txt";
        String fileSer = "buku.ser";

        int pilihan;

        do {
            System.out.println("Selamat Datang di Sistem Perpustakaan");
            System.out.println("1. Tambahkan Buku (menyimpan ke buku.txt)");
            System.out.println("2. Simpan Objek Buku (serialisasi ke buku.ser)");
            System.out.println("3. Tampilkan dari buku.txt");
            System.out.println("4. Tampilkan dari buku.ser");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // clear buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Judul Buku: ");
                    String judul = input.nextLine();
                    System.out.print("Pengarang: ");
                    String pengarang = input.nextLine();
                    System.out.print("Tahun Terbit: ");
                    int tahun = input.nextInt();

                    Buku buku1 = new Buku(judul, pengarang, tahun);
                    FileManager.simpanKeFile(buku1, fileTxt);
                    break;

                case 2:
                    System.out.print("Judul Buku: ");
                    String j = input.nextLine();
                    System.out.print("Pengarang: ");
                    String p = input.nextLine();
                    System.out.print("Tahun Terbit: ");
                    int t = input.nextInt();

                    Buku buku2 = new Buku(j, p, t);
                    FileManager.simpanObjek(buku2, fileSer);
                    break;

                case 3:
                    FileManager.tampilkanDariFile(fileTxt);
                    break;

                case 4:
                    FileManager.bacaObjek(fileSer);
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}
