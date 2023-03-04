/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulanganbersarangfor;
import java.util.Scanner;
/**
 *
 * @author STMIK-I
 */
public class PerulanganBersarangFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instance/Objek Input Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Input: ");
        int tinggi = input.nextInt();  //Mendapatkan Input Dari User
        
        for(int t=1; t<=tinggi; t++){
            //Menghitung Jumlah Tinggi Piramida
            for(int s=t; s<=tinggi; s++){
            //Menghitung Jumlah Spasi per Baris
            System.out.print(" ");
        }
        for(int b=0; b<=(t*2)-2; b++){
            //Menghitung Jumlah Bintang per Baris
            
            System.out.print("*");
        }
        System.out.println();
        //Membuat Baris Baru
    }
}
