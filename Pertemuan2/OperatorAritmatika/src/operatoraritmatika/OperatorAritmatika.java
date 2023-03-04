/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatoraritmatika;
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-35
 */
public class OperatorAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka1, angka2, hasil;
        
        Scanner keyboard = new Scanner(System.in);
        
        // penjumlahan
        System.out.println("Penjumlahan");
        System.out.print("input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        hasil = angka1 + angka2;
        System.out.println("Hasil = " + hasil);
        
        // pengurangan
        System.out.println("Pengurangan");
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        hasil = angka1 - angka2;
        System.out.println("Hasil = " + hasil);
        
        // perkalian
        System.out.println("Perkalian");
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        hasil = angka1 * angka2;
        System.out.println("Hasil = " + hasil);
        
        // pembagian
        System.out.println("Pembagian");
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        hasil = angka1 / angka2;
        System.out.println("Hasil = " + hasil);
        
        // Sisa bagi (Modulus)
        System.out.println("Sisa Bagi (Modulus)");
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        hasil = angka1 % angka2;
        System.out.println("Hasil = " + hasil);
    }
    
}
