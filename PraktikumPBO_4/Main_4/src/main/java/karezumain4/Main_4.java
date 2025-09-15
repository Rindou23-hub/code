/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package karezumain4;

/**
 *
 * @author user
 */
public class Main_4 {
    public static void main(String[] args) {
        // Membuat objek pekerja
        Pekerja pekerja1 = new Pekerja("Guntur", 24, "Guru", 2500000);

        // Menampilkan informasi pekerja menggunakan toString()
        System.out.println("Informasi Pekerja:");
        System.out.println(pekerja1.toString());
        
        pekerja1.setNama("tika");
        System.out.println(pekerja1);
        
        System.out.println(pekerja1.gaji);
                
    }
}