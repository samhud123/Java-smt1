/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputdata;
import java.io.*;
/**
 *
 * @author STMIK-VI-35
 */
public class InputData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.print("Masukkan Nama Anda : ");
        String nama = br.readLine();
        System.out.println("Selamat Datang " + nama);
    }
    
}
