/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package halaman1;
import javax.swing.*;
/**
 *
 * @author SH
 */
public class Halaman1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int h, jh, x1, x2;
        String tampil = "";
        String data = JOptionPane.showInputDialog(null, "Masukkan Data ");
        int x = Integer.parseInt(data);
        h = x % 3;
        
        if ( h == 0 ) {
            jh = x / 3;
        } else {
            jh = ( x / 3 ) + 1;
        }
        
        if ( jh == 1 ) {
            x1 = 1;
            x2 = x;
        } else {
            x1 = 1;
            x2 = 3;
        }
        
        for( int y = 1; y <= jh; y++ ) {
            tampil += "Hal = " + y + "\n";
            tampil += "      INFORMASI DATA      \n";
            tampil += "--------------------------\n";
            tampil += "            NO            \n";
            tampil += "--------------------------\n";
            
            if ( y == jh ) {
                x2 = x;
            }
            
            for ( int z = x1; z <= x2; z++ ) {
                tampil += "             " + z + "\n";
            }
            tampil += "--------------------------\n";
            JOptionPane.showMessageDialog(null, tampil, "INFORMASI DATA", JOptionPane.INFORMATION_MESSAGE);
            tampil = "";
            x1 = x1 + 3;
            x2 = x2 + 3;
        }
    }
    
}
