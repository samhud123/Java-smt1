/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorpenugasan;
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-35
 */
public class OperatorPenugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi variabel
        int a, b;
        
        // membuat scanner
        Scanner keyboard = new Scanner(System.in);
        
        // input nilai 
        System.out.print("Masukkan nilai a = ");
        a = keyboard.nextInt();
        System.out.print("Masukkan nilai b = ");
        b = keyboard.nextInt();
        
        // menampilkan isi variabel
        System.out.println("Variabel a = " + a);
        System.out.println("varaibel b = " + b);
        
        // penambahan
        b += a;
        System.out.println("Penambahan : " + b);
        
        // pengurangan
        b -= a;
        System.out.println("Penambahan : " + b);
        
        // Perkalian
        b *= a;
        System.out.println("Penambahan : " + b);
        
        // pembagian
        b /= a;
        System.out.println("Penambahan : " + b);
        
        // Sisa bagi
        b %= a;
        System.out.println("Penambahan : " + b);
    }
    
}
