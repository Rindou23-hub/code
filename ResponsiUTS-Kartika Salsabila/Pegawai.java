/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_pbo;

/**
 *
 * @author user
 */
// Kelas Induk Pegawai
public class Pegawai {
    // 2. Enkapsulasi dengan akses modifier private
    private String namaPegawai;
    private int gaji;

    // Constructor
    public Pegawai(String namaPegawai, int gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }

    // Metode Getter dan Setter
    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    // Metode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + this.namaPegawai);
        System.out.println("Gaji: " + this.gaji);
    }
}
