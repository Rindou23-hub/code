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
public class PegawaiTetap extends Pegawai {
    private int tunjangan;

    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan) {
        // Memanggil constructor kelas induk (Pegawai)
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    // Override metode tampilkanInfo() untuk menambahkan info tunjangan
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + getNamaPegawai());
        System.out.println("Gaji: " + getGaji());
        System.out.println("Tunjangan: " + this.tunjangan);
        
    }
}