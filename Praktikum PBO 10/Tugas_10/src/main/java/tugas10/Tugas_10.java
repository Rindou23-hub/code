/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugas10;

/**
 *
 * @author user
 */
public class Tugas_10 {

    public static void main(String[] args) {
        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();
        
        double hargaElektronik = 2000000;
        double hargaMakanan = 50000;
        
        double pajakElektronik = elektronik.hitungPajak(hargaElektronik);
        double pajakMakanan = makanan.hitungPajak(hargaMakanan);
        
        System.out.println("Harga Elektronik : Rp" + hargaElektronik);
        System.out.println("Potongan pajak (10%) : Rp" + pajakElektronik);
        
        System.out.println("Harga Makanan : Rp" + hargaMakanan);
        System.out.println("Potongan Pajak (5%) : Rp" + pajakMakanan);
    }
}

