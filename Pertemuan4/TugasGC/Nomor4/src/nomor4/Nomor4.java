/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor4;

/**
 *
 * @author STMIK-VI-35
 */
public class Nomor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for ( int i = 1; i <= 5; i++ ){
            for ( int x = 1; x <= i; x++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
