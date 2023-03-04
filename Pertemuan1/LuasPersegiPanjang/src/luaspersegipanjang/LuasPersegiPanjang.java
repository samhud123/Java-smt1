/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaspersegipanjang;

/**
 *
 * @author STMIK-VI-35
 */
public class LuasPersegiPanjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p, l, luas;
        p = 5;          // input / memasukkan nilai p = 5
        l = 10;         // input / memasukkan nilai l = 10
        luas = p*l;     // Rumus menghitung Luas
        
            // Cetak data dan Hasil Perthitungan
        
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("Panjang = " + p);
        System.out.println("Lebar = " + l);
        System.out.println("Luas Persegi Panjang Adalah = " + luas);
    }
    
}
