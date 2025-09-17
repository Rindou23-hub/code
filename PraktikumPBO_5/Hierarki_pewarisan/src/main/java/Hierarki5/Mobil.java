/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hierarki5;

/**
 *
 * @author user
 */
class Mobil extends KendaraanDarat {
    int jumlahPintu;

    public Mobil(String nama, int kecepatan, int jumlahPintu) {
        super(nama, kecepatan);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
