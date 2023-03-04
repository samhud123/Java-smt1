/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan_bersarang_for_1;
import java.util.Scanner;
/**
 *
 * @author STMIK-I
 */
public class Perulangan_Bersarang_For_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Baris: ");
        int j_baris = input.nextInt(); //Menentukan Jumlah Baris
        //Menghitung Jumlah Baris (Outer for)
        for(int baris=1; baris<=j_baris; baris++){
        //Mencetak Simbol * (Inner for)
        for(int s=1; s<=baris; s++){
        System.out.print("* ");
        }
        //Membuat Baris Baru
        System.out.println();
        }
    }
}
