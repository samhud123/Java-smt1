/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2huruf;

/**
 *
 * @author STMIK-VI-35
 */
public class Array2Huruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Deklarasi array
        String[][]huruf = {
            {"A","B","C"},
            {"D","E","F"},
            {"G","H","I"}
        };
        
        //Menampilkan isi array pada indeks ke-[0][1] dan [2][0]
        System.out.println(huruf[0][1]);
        System.out.println(huruf[2][0]);
    }
}
