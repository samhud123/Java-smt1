/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulanganforif;

/**
 *
 * @author STMIK-VI-35
 */
public class PerulanganForIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        System.out.println("Menampilkan bilangan ganjil antar 1-50");
        for ( x = 1; x <= 50; x++ ) {
            if ( x % 2 == 1 ) {
                System.out.print(x + " ");
            }
        }
    }
    
}
