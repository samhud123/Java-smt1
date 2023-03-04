/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan3;

/**
 *
 * @author STMIK-VI-35
 */
public class Perulangan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi variabel
        int i, x;
        
        System.out.println("Mencetak angka/bilangan dari 1-5 sebanyak 15 kali");
        
        for( x = 1; x <= 15; x++ ){
            for( i = 1; i <= 5; i++ ) {
                System.out.println(i);
            }
            System.out.println("Mencetak perulangan ke-" + x);
        }
    }
    
}
