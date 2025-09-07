/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktikum_pbo3;

public class Main {
    public static void main(String[] args) {
       
        // Objek Hewan
       
        Hewan kucing = new Hewan("Neko", 2);
        kucing.info();
        kucing.suara();
        kucing.berlari();

        System.out.println();

        Hewan anjing = new Hewan("Inu", 3);
        anjing.info();
        anjing.suara();
        anjing.berlari();

        System.out.println("\n=======================\n");
    }
}
