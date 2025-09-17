/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Hierarki5;

/**
 *
 * @author user
 */
public class Hierarki_pewarisan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Avanza", 120, 4);
        SepedaMotor motor = new SepedaMotor("Honda CBR", 150, "4-Tak");

        System.out.println("=== Informasi Mobil ===");
        mobil.tampilkanInfo();

        System.out.println("\n=== Informasi Sepeda Motor ===");
        motor.tampilkanInfo();
    }
}

