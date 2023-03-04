/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprogram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author STMIK-VI-35
 */
public class MyProgram {
    
    static BufferedReader dataIn = new BufferedReader ( new InputStreamReader (System.in) );
    static Scanner keyboard = new Scanner(System.in);
    static boolean isRunning = true;

    static void showMenu() throws IOException {
                System.out.println("========= MENU ========");
                System.out.println("[1] Luas Persgi Panjang");
                System.out.println("[2] Luas Lingkaran");
                System.out.println("[3] Program Hitung Nilai Akhir");
                System.out.println("[4] Perulangan Perkalian");
                System.out.println("[5] Perulangan Bersarang");
                System.out.println("[6] BufferedReader & InputStreamReader");
                System.out.println("[7] Nilai Mahasiswa");
                System.out.println("[8] Array Multi Dimensi");
                System.out.println("[0] Exit");
                System.out.println("=========ooOOoo========");
                System.out.print("PILIH MENU -> ");
                
                int selectedMenu = keyboard.nextInt();
                
                switch(selectedMenu){
                    case 1:
                        luasPersegiPanjang();
                        break;
                    case 2:
                        luasLingkaran();
                        break;
                    case 3:
                        hitungNilaiAkhir();
                        break;
                    case 4:
                        perulanganPerkalian();
                        break;
                    case 5:
                        perulanganBersarang();
                        break;
                    case 6:
                        getInput();
                        break;
                    case 7:
                        nilaiMahasiswa();
                        break;
                    case 8: 
                        arrayMultiDimensi();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Pilihan salah!");
                }
        }
    
    static void luasPersegiPanjang() {
        int p,l;
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.print("Masukan Panjang = " );
        p = keyboard.nextInt();
        System.out.print("Masukan Lebar = " );
        l = keyboard.nextInt();
        int luas = p * l;
        System.out.println("Luas Persegi Panjang Adalah = " + luas);
    }
    
    static void luasLingkaran() {
        double r, luas;
        final double PI = 3.14;
        
        System.out.println("Menghitung Luas Lingkara");
        System.out.print("Masukkan Nilai Radius : ");
        r = keyboard.nextDouble();
        
        // rumus luas lingkaran
        luas = r*r*PI;
        
        // cetak hasil
        System.out.println("Luas Lingkaran dengan radius " + r + " Adalah " + luas);
    }
    
    static void hitungNilaiAkhir() {
        String nama, grade;
        int nr, nt, nu, na;
        
        System.out.println("PROGRAM HITUNG NILAI AKHIR");
        System.out.print("Nama Mahasiswa : ");
        nama = keyboard.next();
        System.out.print("Nilai Responsi : ");
        nr = keyboard.nextInt();
        System.out.print("Nilai Tugas    : ");
        nt = keyboard.nextInt();
        System.out.print("Nilai UTS      : ");
        nu = keyboard.nextInt();
        
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
    
    static void perulanganPerkalian() {
        int i, n, j, a;
        System.out.print("Masukan batas perkalian : ");
        n = keyboard.nextInt();
        for ( i = 1; i <= n; i++ ){
            for ( j = 1; j <= i; j++ ) {
                a = i * j;
                System.out.println(i + " * " + j + " = " + a);
            }
            System.out.println(" ");
        }
    }
    
    static void perulanganBersarang() {
        System.out.print("Masukan Jumlah Baris: ");
        int j_baris = keyboard.nextInt(); //Menentukan Jumlah Baris
        //Menghitung Jumlah Baris (Outer for)
        for(int baris=1; baris<=j_baris; baris++){
        //Mencetak Simbol * (Inner for)
        for(int s=1; s<=baris; s++){
        System.out.print("* ");
        }
        //Membuat Baris Baru
        System.out.println();
        }
    }
    
    static void getInput() {
        String name = " ",hoby = " ";
        
        try {
            System.out.print("Nama Anda : ");
            name = dataIn.readLine();
            System.out.print("Hobi Anda : ");
            hoby = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        }
        
        System.out.println("Jadi Anda Hobi " + hoby + ". hobi yang bagus Mas " + name);
    }
    
    static void nilaiMahasiswa() {
        System.out.print("Masukan Jumlah Mahasiswa : ");
        int n=keyboard.nextInt();
        String nama[]=new String[n];
        String status[]=new String[n];
        int nilai[]=new int[n];
        
        for (int i=0;i<n;i++){
            System.out.println("Mahasiswa Ke : "+(i+1));
            System.out.print("Nama : ");
            nama[i]=keyboard.next();
            System.out.print("Nilai : ");
            nilai[i]=keyboard.nextInt();
            if (nilai[i]<=50) {
                status[i]="Tidak Lulus";
            } else {
                status[i]="Lulus";
            }
        }
        System.out.println("DAFTAR NILAIMAHASISWA");
        System.out.println("======================");
        System.out.println("No Nama Nilai Status");
        for (int i=0; i<n;i++) {
            System.out.println((i+1)+" "+nama[i]+" "+nilai[i]+" "+status[i]);
        }
    }
    
    static void arrayMultiDimensi() {
        String[][] meja = new String[2][3];
        
        // mengisi setiap meja
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja[bar].length; kol++){
                System.out.format("Siapa yang akan duduk di meja (%d,%d): ", bar, kol);
                meja[bar][kol] = keyboard.next();
            }
        }
        
        // menampilkan isi Array
        System.out.println("-------------------------");
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja[bar].length; kol++){
                System.out.format("| %s | \t",
                meja[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        do {
            showMenu();
        } while (isRunning);
    }
    
}
