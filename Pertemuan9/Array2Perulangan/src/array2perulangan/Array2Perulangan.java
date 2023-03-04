/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2perulangan;

/**
 *
 * @author STMIK-VI-35
 */
public class Array2Perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Deklarasi array 2 dimensi
        String[][]huruf = {
            {"A","B","C"},
            {"D","E","F"},
            {"G","H","I"},
        };
        
        //Menampilkan isi array dengan perulangan
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(huruf[i][j]+" ");
            }
        System.out.println();
        }
    }
}

