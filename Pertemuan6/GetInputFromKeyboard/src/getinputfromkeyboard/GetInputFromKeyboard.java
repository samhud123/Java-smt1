/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getinputfromkeyboard;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author STMIK-VI-35
 */
public class GetInputFromKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader ( new InputStreamReader (System.in) );
        String name = " ",hoby = " ";
        
        try {
            System.out.print("Nama Anda : ");
            name = dataIn.readLine();
            System.out.print("Hobi Anda : ");
            hoby = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        }
        
        System.out.println("Jadi Anda Hobi " + hoby + ". hobi yang bagus Mas " + name);
    }
    
}
