/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-35
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukan angka yang akan dimasukan : ");
        int jmlAngka = scan.nextInt();
        System.out.println("");
        int bil[] = new int [jmlAngka];
        for (int i=0;i<jmlAngka;i++){
        System.out.print("Silakan masukan angka"+(i+1)+ " : ");
        bil[i] = scan.nextInt();}
        InsertionAsc(bil,bil.length);
        System.out.println("\n--------------------------------");
        
        System.out.print("Hasil pengurutan Ascending : ");
        for(int i = 0; i < bil.length; i++){
        System.out.print(bil[i] + " ");
        }
        InsertionDesc(bil,bil.length);
        System.out.println("\n--------------------------------");
        System.out.print("Hasil pengurutan Descending : ");
        for(int i = 0; i < bil.length; i++){
        System.out.print(bil[i] + " ");
        }
        System.out.println("\n--------------------------------");
        }
        static int [] InsertionAsc(int bilangan[], int n)
        {
        for (int i = 1; i < n; i++){
        int j = i;
        int B = bilangan[i];
        while ((j > 0) && (bilangan[j-1] > B)){
        bilangan[j] = bilangan[j-1];
        j--;
        }
        bilangan[j] = B;
        }
        return bilangan;
        }
        static int [] InsertionDesc(int bilangan[], int n)
        {
        for (int i = 1; i < n; i++){
        int j = i;
        int B = bilangan[i];
        while ((j > 0) && (bilangan[j-1] < B)){
        bilangan[j] = bilangan[j-1];
        j--;
        }
        bilangan[j] = B;
        }
        return bilangan;
    } 
}
