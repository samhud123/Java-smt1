/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luassegitiga;

import java.util.Scanner;

/**
 *
 * @author STMIK-VI-35
 */
public class LuasSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi variabel
        double alas, tinggi, luas;
        
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        // menmapilkan ke layar
        System.out.println("Menghitung luas Segitiga");
        System.out.print("Masukkan Nilai Alas = ");
        alas = keyboard.nextDouble();
        System.out.print("Masukkan Nilai Tinggi = ");
        tinggi = keyboard.nextDouble();
        
        // rumus luas segitiga
        luas = (alas * tinggi)/2;
        
        // menampilkan hasil
        System.out.println("Luas Segiti adalah = " + luas);
    }
    
}
