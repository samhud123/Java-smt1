/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputnama;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

        /**
 *
 * @author STMIK-VI-35
 */
public class InputNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in) );
        String nama = " ";
        System.out.print("Siapa Namanya : ");
        
        try {
            nama = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        
        System.out.println("Hello " + nama + "!");
    }
    
}
