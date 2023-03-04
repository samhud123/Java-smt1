/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_nilai;
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-35
 */
public class Switch_Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama, grade;
        int nr, nt, nu, na;
        
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM HITUNG NILAI AKHIR");
        System.out.print("Nama Mahasiswa : ");
        nama = input.nextLine();
        System.out.print("Nilai Responsi : ");
        nr = input.nextInt();
        System.out.print("Nilai Tugas    : ");
        nt = input.nextInt();
        System.out.print("Nilai UTS      : ");
        nu = input.nextInt();
        
        nr = (nr*20)/100;
        nt = (nt*30)/100;
        nu = (nu*50)/100;
        na = nr+nt+nu;
        
        if(na >= 90){
            grade = "A";
        } else if (na >= 80) {
            grade = "B";
        } else if (na >= 70) {
            grade = "C";
        } else if (na >= 60) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        System.out.println("==============================================");
        System.out.println("Siswa Yang Bernama  : " + nama);
        System.out.println("Dengan Nilai Yang Dihasilkan");
        System.out.println("Nilai Responsi * 20 : " + nr);
        System.out.println("Nilai Tugas * 30    : " + nt);
        System.out.println("Nilai UTS * 50      : " + nu);
        System.out.println("Jadi Mahasiswa Yang Bernama : " + nama + " Memperoleh Nilai Akhir : " + na);
        System.out.println("Grade Nilai Yang Didapat Adalah : " + grade);
    }
    
}
