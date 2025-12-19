/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan_digital;

/**
 *
 * @author user
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan implements Serializable {
    private List<Anggota> daftarAnggota;

    public Perpustakaan() {
        daftarAnggota = new ArrayList<>();
    }

    public void tambahAnggota(Anggota a) {
        daftarAnggota.add(a);
    }

    public void simpanData(String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(this);
            System.out.println("Data berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data: " + e.getMessage());
        }
    }

    public static Perpustakaan bacaData(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (Perpustakaan) ois.readObject();
        } catch (Exception e) {
            System.out.println("Gagal membaca data: " + e.getMessage());
            return new Perpustakaan();
        }
    }

    public void tampilAnggota() {
        for (Anggota a : daftarAnggota) {
            System.out.println("Nama Anggota: " + a.getNama());
        }
    }
}

