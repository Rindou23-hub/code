/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_pbo;

/**
 *
 * @author user
 */
// 3. Kelas Turunan dari Pegawai
public class PegawaiKontrak extends Pegawai {
    private int lamaKontrak; // dalam bulan

    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak) {
        // Memanggil constructor kelas induk (Pegawai)
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    // Override metode tampilkanInfo() untuk menambahkan info lama kontrak
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + getNamaPegawai());
        System.out.println("Gaji: " + getGaji());
        System.out.println("Lama Kontrak: " + this.lamaKontrak + " bulan");
    }
}
