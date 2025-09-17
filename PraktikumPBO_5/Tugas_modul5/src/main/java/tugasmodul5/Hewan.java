/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul5;

/**
 *
 * @author user
 */
class Hewan {
    String nama;
    String jenis;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}