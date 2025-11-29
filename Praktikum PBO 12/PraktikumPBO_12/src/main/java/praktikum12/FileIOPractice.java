/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

/**
 *
 * @author user
 */
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileIOPractice {
    public static void main(String[] args) {
        String filePath = "data.txt"; // Nama file yang akan dibuat

        // Menulis data ke file menggunakan FileWriter
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Belajar File I/O di Java!\n");
            writer.write("Pemrograman Berorientasi Objek.\n");
            System.out.println("Data berhasil ditulis ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file.");
            e.printStackTrace();
        }

        // Membaca data dari file menggunakan FileReader
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            System.out.println("\nIsi file:");
            // Membaca per karakter sampai akhir file (ditandai dengan -1)
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // Konversi byte/int ke char
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        }
    }
}
