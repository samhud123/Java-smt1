/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1scanner;
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-35
 */
public class Array1Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Jumlah Kata : ");
        int n=input.nextInt();
        //Deklarasi array
        String kata[]=new String[n];
        //Input data ke array
        for(int i=0;i<kata.length;i++)
        {
            System.out.print("Kata ke "+(i+1)+" : ");
            kata [i]=input.next();
        }
        //Menampilkan data dalam array
        System.out.println("Kata-kata yang dimasukan");
        for(int i=0;i<kata.length;i++)
        {
            System.out.println(kata[i]);
        }
        }
}
