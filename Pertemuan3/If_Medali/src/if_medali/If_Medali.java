/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_medali;
import java.util.Scanner;

/**
 *
 * @author STMIK-VI-35
 */
public class If_Medali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int point;
        String nama;
        
        System.out.println("==============================================");
        System.out.print("Masukkan Nama : ");
        nama = masuk.nextLine();
        System.out.print("Masukkan jumlah point 1..3 = ");
        point = masuk.nextInt();
        System.out.println("==============================================");
        System.out.println("Nama  : " + nama);
        System.out.println("Point : " + point);
        
        if (point >= 3)
            System.out.println("Ket : Medali EMAS");
        else if (point >= 2)
            System.out.println("Ket : Medali PERAK");
        else if (point == 1)
            System.out.println("Ket : Medali PERUNGGU");
        else 
            System.out.println("Ket : Tidak mendapat mendali");
        System.out.println("==============================================");
    }
    
}
