/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_menu;
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-35
 */
public class Switch_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("----------PROGRAM MENGHITUNG LUAS----------");
        System.out.println("==============================================");
        System.out.println("1. Luas Persegi Panjang");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("");
        System.out.println("Ketik Angka untuk memilih");
        System.out.print("Pilih Luas : ");
        int pilih = input.nextInt();
        System.out.println("==============================================");
        
        switch (pilih) {
            case 1:
                System.out.print("Masukkan Panjang : ");
                int d = input.nextInt();
                System.out.print("Masukkan Lebar : ");
                int e = input.nextInt();
                int z = d * e;
                System.out.println("");
                System.out.println("==============================================");
                System.out.println("Luas Persegi Panjang = " + z);
                break;
            case 2:
                System.out.print("Masukkan Alas : ");
                int f = input.nextInt();
                System.out.print("Masukkan Tinggi : ");
                int g = input.nextInt();
                int y = (f * g) / 2;
                System.out.println("");
                System.out.println("==============================================");
                System.out.println("Luas Segitiga = " + y);
                break;
            case 3:
                System.out.print("Masukkan Jari-Jari : ");
                f = input.nextInt();
                y = f * f * 22/7;
                System.out.println("");
                System.out.println("==============================================");
                System.out.println("Luas Lingkaran = " + y);
                break;
        }
    }
    
}
