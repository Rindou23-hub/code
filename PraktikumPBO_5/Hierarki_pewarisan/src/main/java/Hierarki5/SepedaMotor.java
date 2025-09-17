/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hierarki5;

/**
 *
 * @author user
 */
class SepedaMotor extends KendaraanDarat {
    String jenisMesin;

    public SepedaMotor(String nama, int kecepatan, String jenisMesin) {
        super(nama, kecepatan);
        this.jenisMesin = jenisMesin;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
