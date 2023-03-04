/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datahotel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SH
 */
public class DataHotel {
    
    Record record = new Record();
    static ArrayList dataHotel = new ArrayList();
    static boolean isRunning = true, lanjut = true;
    static Scanner keyboard = new Scanner(System.in);
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static void showMenu() throws IOException {
                System.out.println("        PT CENTRAL JAVA       ");
                System.out.println("  Jl. Kapuas No.1 Pekalongan  ");
                System.out.println("==============================");
                System.out.println("          DATA HOTEL          ");
                System.out.println("");
                System.out.println("========= MENU UTAMA =========");
                System.out.println("[1] Add Data");
                System.out.println("[2] Delete Data");
                System.out.println("[3] Update Data");
                System.out.println("[4] Search Data");
                System.out.println("[5] Display Data");
                System.out.println("[6] Exit Program");
                System.out.print("Enter your selection : ");
                
                int selectedMenu = Integer.valueOf(input.readLine());
                
                switch(selectedMenu){
                    case 1:
                        addData();
                        break;
                    case 2:
                        deleteData();
                        break;
                    case 3:
                        updateData();
                        break;
                    case 4:
                        searchData();
                        break;
                    case 5:
                        displayData();
                    case 6:
                        System.exit(0);
                    break;
                    default:
                        System.out.println("Pilihan salah!");
                }
        }
    
    static void addData() {
        // variabel
        while (lanjut) {            
            int kode, lamaInap;
            double harga = 0, jumlahBayar, pajak, totalBayar;
            String nama, tipeKamar, lagi;

            System.out.println("==============================");
            System.out.println("        PT CENTRAL JAVA       ");
            System.out.println("  Jl. Kapuas No.1 Pekalongan  ");
            System.out.println("==============================");
            System.out.println("     Transaksi Penginapan     ");
            System.out.println("");
            System.out.print("Kode Transaksi : ");
            kode = keyboard.nextInt();
            System.out.print("Nama           : ");
            nama = keyboard.next();
            System.out.print("Tipe Kamar     : ");
            tipeKamar = keyboard.next();

            if ( tipeKamar.equalsIgnoreCase("President") ) {
                harga = 2000000.0;
            } else if ( tipeKamar.equalsIgnoreCase("Deluxe") ) {
                harga = 1250000.0;
            } else if ( tipeKamar.equalsIgnoreCase("Family") ) {
                harga = 1000000.0;
            }

            System.out.println("Harga          : Rp. " + harga);
            System.out.print("Lama Inap      : " );
            lamaInap = keyboard.nextInt();

            jumlahBayar = harga * lamaInap;
            pajak = (2.5 / 100)* jumlahBayar;
            totalBayar = jumlahBayar + pajak;

            System.out.println("Jumlah Bayar   : Rp. " + jumlahBayar);
            System.out.println("Pajak          : Rp. " + pajak);
            System.out.println("Total Bayar    : Rp. " + totalBayar);
            
//            record = new Record(name, idNumber, position);
            
            System.out.print("Input Data lagi ? [y/t] : ");
            lagi = keyboard.next();
            if ( lagi.equalsIgnoreCase("t") ) {
                lanjut = false;
            }
        }
    }
    
    static void deleteData() {
        
    }
    
    static void updateData() {
        
    }
    
    static void searchData() {
        
    }
    
    static void displayData() {
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        do {
            showMenu();
        } while (isRunning);
    }
}
