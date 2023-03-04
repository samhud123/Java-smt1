/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputbilangan;
import java.io.*;
/**
 *
 * @author STMIK-VI-35
 */
public class InputBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int input = 0;
        BufferedReader data = new BufferedReader ( new InputStreamReader (System.in) );
        System.out.print("Masukkan Angka :");
        
        try {
            input = Integer.parseInt(data.readLine());
        } catch (IOException e) {
            System.out.println("Error!");
        }
        
        if ( input % 2 == 0 ) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
    }
    
}
