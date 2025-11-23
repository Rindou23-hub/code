/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas11;

/**
 *
 * @author user
 */
public class Pengarang {
    private String namaPengarang;
    
    public Pengarang(String nama) {
        this.namaPengarang = nama;
    }
    public void infoPengarang() {
        System.out.println("Pengarang: " + namaPengarang);
    }
    public String getNamaPengarang() {
        return namaPengarang;
    }
}
