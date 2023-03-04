/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_tunggal;
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-35
 */
public class If_Tunggal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan Nilai : ");
        nilai = masuk.nextInt();
        
        if ( nilai > 15 )
        {
            System.out.println("Nilai yang dimasukkan lebih dari 15");
            System.out.println("Anda Berhasil");
        }
    }
    
}
