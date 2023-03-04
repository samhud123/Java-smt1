/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorpembandingan;
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-35
 */
public class OperatorPembandingan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi variabel
        int nilaiA, nilaiB;
        boolean hasil;
        
        // membuat scanner 
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan nilaiA : ");
        nilaiA = keyboard.nextInt();
        System.out.print("Masukkan nilaiB : ");
        nilaiB = keyboard.nextInt();
        
        // tampilkan nilai variable
        System.out.println("Nilai Variabel");
        System.out.println("NilaiA : " + nilaiA);
        System.out.println("NilaiB : " + nilaiB);
        System.out.println("============================");
        
        System.out.println("Operator Pembandingan");
        System.out.println("============================");
        System.out.println("Apakah A lebih besar dari B?");
        hasil = nilaiA > nilaiB;
        System.out.println(hasil);
        
        System.out.println("============================");
        System.out.println("Apakah A lebih besar sama dengan B?");
        hasil = nilaiA >= nilaiB;
        System.out.println(hasil);
        
        System.out.println("============================");
        System.out.println("Apakah A lebih kecil sama dengan B?");
        hasil = nilaiA <= nilaiB;
        System.out.println(hasil);
        
        System.out.println("============================");
        System.out.println("Apakah A sama dengan B?");
        hasil = nilaiA == nilaiB;
        System.out.println(hasil);
        
        System.out.println("============================");
        System.out.println("Apakah A tidak sama dengan B?");
        hasil = nilaiA != nilaiB;
        System.out.println(hasil);
    }
    
}
