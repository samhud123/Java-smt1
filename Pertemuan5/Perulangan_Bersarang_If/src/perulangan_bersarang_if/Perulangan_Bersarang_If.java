/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan_bersarang_if;
import java.io.*;
/**
 *
 * @author STMIK-I
 */
public class Perulangan_Bersarang_If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        String wak, kul, jurusan;
        int biaya, total;
        BufferedReader x = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Masukkan Kode Kuliah [pg/sg/ma/xc] : ");
        kul=x.readLine();
        if (kul.equalsIgnoreCase("pg")){
            jurusan="System Informasi";
            wak="Pagi";
            biaya=1200000;
        }
        else if (kul.equalsIgnoreCase("sg")){
            jurusan="System Informasi";
            wak="Siang";
            biaya=1300000;
        }
        else if (kul.equalsIgnoreCase("ma")){
            jurusan="System Informasi";
            wak="Malam";
            biaya=1500000;
        }
        else if (kul.equalsIgnoreCase("xc")){
            jurusan="System Informasi";
            wak="Eksekutif";
            biaya=2000000;
        }
        else {
            jurusan="Data Tidak ada";
            wak="Data Tidak ada";  
            
            biaya=0;
        }
        total=biaya+50000;
        System.out.println("Nama Jurusan : "+jurusan);
        System.out.println("Waktu Kuliah : "+wak);
        System.out.println("Biaya Kuliah : "+biaya);
        System.out.println("Total Bayar : "+total);
        }
}

