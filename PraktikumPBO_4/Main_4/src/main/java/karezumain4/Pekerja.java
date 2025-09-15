/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karezumain4;

/**
 *
 * @author user
 */
public class Pekerja extends Manusia {
    // Atribut tambahan
    private double gaji;  // private

    // Constructor (menginisialisasi semua atribut: nama, usia, pekerjaan, gaji)
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // panggil constructor Manusia
        this.gaji = gaji;
    }

    // Getter dan Setter untuk gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override toString() untuk menampilkan semua informasi
    @Override
    public String toString() {
        return "Nama: " + getNama() +
               ", Usia: " + usia +        // usia protected → bisa langsung dipakai di subclass
               ", Pekerjaan: " + pekerjaan + // pekerjaan public
               ", Gaji: " + gaji;
    }
}