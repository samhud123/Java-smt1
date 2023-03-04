/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaslingkaran;
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-35
 */
public class LuasLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi variabel
        double r, luas;
        final double PI = 3.14;
        
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Menghitung Luas Lingkara");
        System.out.print("Masukkan Nilai Radius : ");
        r = keyboard.nextDouble();
        
        // rumus luas lingkaran
        luas = r*r*PI;
        
        // cetak hasil
        System.out.println("Luas Lingkaran dengan radius " + r + " Adalah " + luas);
    }
    
}
