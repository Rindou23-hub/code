/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hierarki5;

/**
 *
 * @author user
 */
class KendaraanDarat extends Kendaraan {
    public KendaraanDarat(String nama, int kecepatan) {
        super(nama, kecepatan);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis: Kendaraan Darat");
    }
}
