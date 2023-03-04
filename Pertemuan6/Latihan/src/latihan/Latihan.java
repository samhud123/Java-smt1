/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author STMIK-VI-35
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in) );
        
        String namaDepan, namaBelakang, alamat, tempatLahir, tanggalLahir;
        int usia;
        
        System.out.println("=====================================================");
        System.out.println("-------------------Data Pelanggan--------------------");
        System.out.println("---------------------Toko Buku-----------------------");
        System.out.println("------------------\"Cahaya Ilmu Sejati\"---------------");
        System.out.println("-----------Jln. Kebon Jahe no.23, Sidoarjo-----------");
        System.out.println("=====================================================");
        System.out.println("");
        System.out.print("Masukkan Nama Depan    : ");
        namaDepan = dataIn.readLine();
        System.out.print("Masukkan Nama Belakang : ");
        namaBelakang = dataIn.readLine();
        System.out.print("Masukkan Alamat        : ");
        alamat = dataIn.readLine();
        System.out.print("Masukkan Tempat Lahir  : ");
        tempatLahir = dataIn.readLine();
        System.out.print("Masukkan Tanggal Lahir : ");
        tanggalLahir = dataIn.readLine();
        System.out.print("Usia Pelanggan         : ");
        usia = Integer.parseInt(dataIn.readLine());
        System.out.println("");
        System.out.println("=====================================================");
        System.out.println("-------------------Data Pelanggan--------------------");
        System.out.println("---------------------Toko Buku-----------------------");
        System.out.println("------------------\"Cahaya Ilmu Sejati\"---------------");
        System.out.println("-----------Jln. Kebon Jahe no.23, Sidoarjo-----------");
        System.out.println("=====================================================");
        System.out.println("");
        System.out.println("Nama Lengkap : " + namaDepan + " " + namaBelakang);
        System.out.println("Alamat       : " + alamat);
        System.out.println("Tempat / Tanggal Lahir : " + tempatLahir + ", " + tanggalLahir);
        System.out.println("Usia         : " + usia + " tahun");
    }
    
}
