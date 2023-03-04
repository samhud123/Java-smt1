/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;

/**
 *
 * @author SH
 */
public class Mobil {
    
    String warna = "Merah";
    String merk = "BMW";
    
    void maju() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak maju");
    }
    
    void mundur() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak mundur");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek
        Mobil mobilsaya = new Mobil();
        mobilsaya.maju();
        mobilsaya.mundur();
    }
    
}
