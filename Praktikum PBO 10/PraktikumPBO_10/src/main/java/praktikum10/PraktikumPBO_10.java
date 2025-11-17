/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum10;

/**
 *
 * @author user
 */
public class PraktikumPBO_10 {

    public static void main(String[] args) {
        //Objek Penjumlahan
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("Penjumlahan: " + penjumlahan.hitung(10, 5));
        
        //Objek Pengurangan
        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("Pengurangan: " + pengurangan.hitung(10, 5));
    }
}
