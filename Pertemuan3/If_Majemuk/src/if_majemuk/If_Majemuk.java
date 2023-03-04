/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_majemuk;
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-35
 */
public class If_Majemuk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai1, nilai2;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama = ");
        nilai1 = masuk.nextInt();
        System.out.print("Masukkan bilangan kedua = ");
        nilai2 = masuk.nextInt();
        
        if (nilai1 == nilai2)
            System.out.println(nilai1 + " = " + nilai2);
        if (nilai1 >= nilai2)
            System.out.println(nilai1 + " >= " + nilai2);
        if (nilai1 <= nilai2)
            System.out.println(nilai1 + " <= " + nilai2);
        if (nilai1 != nilai2)
            System.out.println(nilai1 + " != " + nilai2);
    }
    
}
