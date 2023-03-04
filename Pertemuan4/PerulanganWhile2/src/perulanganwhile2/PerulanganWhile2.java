/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulanganwhile2;
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-35
 */
public class PerulanganWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        while ( running ) {
            System.out.println("Apakah Anda ingin keluar?");
            System.out.print("Jawab [y/t] > ");
            jawab = scan.nextLine();
            
            if ( jawab.equalsIgnoreCase("y") ) {
                running = false;
            }
            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan " + " sebanyak " + counter + " kali");
    }
    
}
