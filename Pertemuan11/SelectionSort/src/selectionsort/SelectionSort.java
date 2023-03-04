/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-35
 */
public class SelectionSort {

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
        SelectionASC(bil);
        System.out.println("\n--------------------------------");
        System.out.print("Hasil pengurutan Ascending : ");
        for(int i = 0; i < bil.length; i++){
        System.out.print(bil[i] + " ");
        }
        SelectionDesc(bil);
        System.out.println("\n--------------------------------");
        System.out.print("Hasil pengurutan Descending : ");
        for(int i = 0; i < bil.length; i++){
        System.out.print(bil[i] + " ");
        }
        System.out.println("\n--------------------------------");
        }
        static int [] SelectionASC (int[] bil) {
        for(int i=0; i<bil.length; i++){
        for(int j=i+1; j<bil.length; j++){
        if(bil[i] > bil[j]){
        int temp = bil[j];
        bil[j] = bil[i];
        bil[i] = temp;
        }
        }
        }
        return bil;
        }
        static int [] SelectionDesc (int[] bil) {
        for(int i=0; i<bil.length; i++){
        for(int j=i+1; j<bil.length; j++){
        if(bil[i] < bil[j]){
        int temp = bil[j];
        bil[j] = bil[i];
        bil[i] = temp;
        }
        }
        }
        return bil;
    }
}
