/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penggajian;
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-16
 */
public class Penggajian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Deklarasi variabel
        String NIP, nama, alamat, jabatan = "";
        double gapok = 0, tunjangan = 0, totalGaji, pot, gajiTerima;
        // membuat scanner
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("              PT. MAJU SENTOSA               ");
        System.out.println("        Jl Kemerdekaan Kota Pekalongan       ");
        System.out.println("=============================================");
        System.out.println("");
        
        System.out.print("NIP             = ");
        NIP = keyboard.next();
        System.out.print("Nama            = ");
        nama = keyboard.next();
        System.out.print("Alamat          = ");
        alamat = keyboard.next();
        System.out.print("Jabatan         = ");
        jabatan = keyboard.next();
        
        if (jabatan.equalsIgnoreCase("Direktur")){
            gapok = 5000000.0;
            tunjangan = 2000000.0;
        } else if (jabatan.equalsIgnoreCase("Kabag")) {
            gapok = 3000000.0;
            tunjangan = 1000000.0;
        } else if(jabatan.equalsIgnoreCase("Karyawan")) {
            gapok = 1500000.0;
            tunjangan = 0.0;
        }
        
        System.out.println("Gapok           = Rp. " + gapok);
        System.out.println("Tunjangan       = Rp. " + tunjangan);
        
        totalGaji = gapok + tunjangan;
        System.out.println("Total Gaji      = Rp. " + totalGaji);
        
        System.out.print("Potongan        = Rp. ");
        pot = keyboard.nextDouble();
        
        gajiTerima = totalGaji - pot;
        System.out.println("Gaji Diterima   = Rp. " + gajiTerima);
        System.out.println("");
    }
}
