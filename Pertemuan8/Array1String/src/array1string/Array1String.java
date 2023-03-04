/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1string;

/**
 *
 * @author STMIK-VI-35
 */
public class Array1String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // deklarasi nama dan isi variabel array
        String [] City = {"Jakarta","Malang","Surabaya","Tokyo","Manila","Hongkong","Tiongkok"};
        // memanggil semua isi elemen array
        for (int i =0; i<City.length; i++){
            System.out.println((i)+". City "+City[i]); //menampilkan semua isi array
        } // kurung kurawa for, akhir koding for
        
        // ==== Menampilkan elemen tertentu
        System.out.print("\nMenampilkan City 1 adalah "+City[1]);
    }
}
    
