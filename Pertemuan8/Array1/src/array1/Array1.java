/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author STMIK-VI-35
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // mendeklarasikan nama variabel bertipe array dengan tipe int
        int [] month;
        // menentukan jumlah elemen array
        month = new int[12];
        // mengisikan nilai dari setiap elemen array
        month[0] = 31;
        month[1] = 28;
        month[2] = 31;
        month[3] = 30;
        month[4] = 31;
        month[5] = 30;
        month[6] = 31;
        month[7] = 31;
        month[8] = 30;
        month[9] = 31;
        month[10] = 30;
        month[11] = 31;
        // menampilkan elemen array
        System.out.println("Month 3 is " + month[3]
        + " days.");
    }
}
