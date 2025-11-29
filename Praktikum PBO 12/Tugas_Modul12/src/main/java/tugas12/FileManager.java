/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas12;

/**
 *
 * @author user
 */
import java.io.*;
import java.util.ArrayList;

public class FileManager {

    // FILE I/O Menyimpan teks kedalam buku.txt
    public static void simpanKeFile(Buku buku, String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(buku.toString() + "\n");
            System.out.println("Data buku berhasil disimpan ke " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis ke file.");
            e.printStackTrace();
        }
    }

    // FILE I/O untuk membaca isi buku.txt
    public static void tampilkanDariFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\n== Daftar Buku dari buku.txt ==");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        }
    }

    // SERIALISASI Menyimpan objek ke buku.ser
    public static void simpanObjek(Buku buku, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(buku);
            System.out.println("Objek buku berhasil diserialisasi ke " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat serialisasi objek.");
            e.printStackTrace();
        }
    }

    // DESERIALISASI Untuk membaca objek dari buku.ser
    public static void bacaObjek(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Buku buku = (Buku) ois.readObject();
            System.out.println("\n== Data Buku dari buku.ser ==");
            System.out.println(buku);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca objek.");
            e.printStackTrace();
        }
    }
}