/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputnilai;
import java.io.*;
/**
 *
 * @author STMIK-VI-35
 */
public class InputNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int UTS, UAS;
        double Nilai_Akhir;
        String Nama, NIM;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan NIM       : ");
        NIM = br.readLine();
        System.out.print("Masukkan Nama      : ");
        Nama = br.readLine();
        System.out.print("Masukkan Nilai UTS : ");
        UTS = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai UAS : ");
        UAS = Integer.parseInt(br.readLine());
        Nilai_Akhir = 0.4*UTS + 0.6*UAS;
        System.out.println("");
        System.out.println("============================================");
        System.out.println("NIM         : " + NIM);
        System.out.println("Nama        : " + Nama);
        System.out.println("Nilai UTS   : " + UTS);
        System.out.println("Nilai UAS   : " + UAS);
        System.out.println("Nilai Akhir : " + Nilai_Akhir);
        System.out.print("============================================");
    }
    
}
