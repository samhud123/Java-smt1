/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerkaryawan;

// mengimport scanner ke program
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-35
 */
public class ScannerKaryawan {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi variabel
        String nama, alamat;
        int usia, gaji;
        
        // mencetak scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        // tampilkan output ke user
        System.out.println("Pendataan Karyawan PT.Sejahtera");
        System.out.print("Nama Karyawan : ");
        nama = keyboard.next();
        System.out.print("Alamat : ");
        alamat = keyboard.next();
        System.out.print("Usia : ");
        usia = keyboard.nextInt();
        System.out.print("Gaji : ");
        gaji = keyboard.nextInt();
        
        // menampilkan apa yang sudah disimpan di variabel
        System.out.println("-----------------------------");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + usia + " tahun");
        System.out.println("Gaji : Rp " + gaji);
    }
    
}
