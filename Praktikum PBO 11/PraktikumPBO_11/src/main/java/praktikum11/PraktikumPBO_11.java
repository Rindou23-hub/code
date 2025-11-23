/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum11;

/**
 *
 * @author user
 */
public class PraktikumPBO_11 {

    public static void main(String[] args) {
        Anggota a1 = new Anggota("Yuri");
        Anggota a2 = new Anggota("Tamura");
        Anggota a3 = new Anggota("Toono");

        Klub klubFotografi = new Klub("Yaribu");

        klubFotografi.tambahAnggota(a1);
        klubFotografi.tambahAnggota(a2);
        klubFotografi.tambahAnggota(a3);

        klubFotografi.infoKlub(); 

    }
}
