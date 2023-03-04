/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasap;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author SH
 */
public class TugasAP {
    
    // Start Variable Globar Fungsi Pertemuan 12
    public static String hasil, laporan, ket, grade;
    public static float sem_ipk = 0f, sem=0f, tot_ipk=0f, rata_nil=0f , rata_ipk=0f;
    public static int uji, x , ll =0 , tl=0 , tot_nil=0;
    public static int no_data;

    private static int h;
    private static int jh;
    private static int x1;
    private static int x2;
    private static String tampil ;
    private static boolean keluar;
    private static int c;
    private static int t_data;
    private static int no;
    // End Variable Global Fungsi Pertemuan 12
    
    // start komponen pertemuan 13
    public static String warna, merk;
    void maju() {
        System.out.println("Maju -> Mobil " + merk + " warna " + warna + " bergerak maju");
    }
    
    void mundur() {
        System.out.println("Mundur -> Mobil " + merk + " warna " + warna + " bergerak mundur");
    }
    // End komponen pertemuan 13
    
    // membuat input scanner
    static Scanner keyboard = new Scanner(System.in);
    static boolean isRunning = true;

    // menampilkan display menu
    static void showMenu() throws IOException {
                System.out.println("========= MENU ========");
                System.out.println("[1] Pertemuan 8 - Array 1 Percabangan");
                System.out.println("[2] Pertemuan 9 - Array Multi Dimensi");
                System.out.println("[3] pertemuan 10 - Program Fungsi Menu");
                System.out.println("[4] Pertemuan 11 - InsertionSort");
                System.out.println("[5] Pertemuan 12 - Laporan Per Halaman");
                System.out.println("[6] Pertemuan 13 - Class & Objek");
                System.out.println("[0] Exit");
                System.out.println("=========ooOOoo========");
                System.out.print("PILIH MENU -> ");
                
                int selectedMenu = keyboard.nextInt();
                
                switch(selectedMenu){
                    case 1:
                        pertemuan8();
                        break;
                    case 2:
                        pertemuan9();
                        break;
                    case 3:
                        pertemuan10();
                        break;
                    case 4:
                        pertemuan11();
                        break;
                    case 5:
                        pertemuan12();
                        break;
                    case 6:
                        pertemuan13();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Pilihan salah!");
                }
        }
    
    // start function pertemuan 8
    static void pertemuan8() {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Jumlah Mahasiswa : ");
        int n=input.nextInt();
        String nama[]=new String[n];
        String status[]=new String[n];
        int nilai[]=new int[n];
        
        for (int i=0;i<n;i++){
            System.out.println("Mahasiswa Ke : "+(i+1));
            System.out.print("Nama : ");
            nama[i]=input.next();
            System.out.print("Nilai : ");
            nilai[i]=input.nextInt();
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
    // end function pertemuan 8
    
    // start function pertemuan 9
    static void pertemuan9() {
        // Membuat Array dan Scanner
        String[][] meja = new String[2][3];
        Scanner scan = new Scanner(System.in);
        
        // mengisi setiap meja
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja[bar].length; kol++){
                System.out.format("Siapa yang akan duduk di meja (%d,%d): ", bar, kol);
                meja[bar][kol] = scan.nextLine();
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
    // end function pertemuan 9
    
    // start function pertemuan 10
    static void pertemuan10() {
        System.out.println("Pertemuan 10 adalah program fungsi menu ini sendiri");
    }
    // end function pertemuan 10
    
    // start function pertemuan 11
    static void pertemuan11() {
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukan angka yang akan dimasukan : ");
        int jmlAngka = scan.nextInt();
        System.out.println("");
        int bil[] = new int [jmlAngka];
        for (int i=0;i<jmlAngka;i++){
        System.out.print("Silakan masukan angka"+(i+1)+ " : ");
        bil[i] = scan.nextInt();}
        InsertionAsc(bil,bil.length);
        System.out.println("\n--------------------------------");
        
        System.out.print("Hasil pengurutan Ascending : ");
        for(int i = 0; i < bil.length; i++){
        System.out.print(bil[i] + " ");
        }
        InsertionDesc(bil,bil.length);
        System.out.println("\n--------------------------------");
        System.out.print("Hasil pengurutan Descending : ");
        for(int i = 0; i < bil.length; i++){
        System.out.print(bil[i] + " ");
        }
        System.out.println("\n--------------------------------");
        }
        static int [] InsertionAsc(int bilangan[], int n)
        {
        for (int i = 1; i < n; i++){
        int j = i;
        int B = bilangan[i];
        while ((j > 0) && (bilangan[j-1] > B)){
        bilangan[j] = bilangan[j-1];
        j--;
        }
        bilangan[j] = B;
        }
        return bilangan;
        }
        static int [] InsertionDesc(int bilangan[], int n)
        {
        for (int i = 1; i < n; i++){
        int j = i;
        int B = bilangan[i];
        while ((j > 0) && (bilangan[j-1] < B)){
        bilangan[j] = bilangan[j-1];
        j--;
        }
        bilangan[j] = B;
        }
        return bilangan;
    }
    // end function pertemuan 11
    
    // start function pertemuan 12
    static void pertemuan12() {
        no_data = 0;
        String nama[] = null;
        nama = new String[8];
        
        int nilai[];
        nilai = new int[8];
        
        float ipk[];
        ipk = new float[8];
        
        x = -1;
        boolean lanjut = true, lewat = true;
        String lapor = "",lagi = "y";
        keluar = true;
        
        do {
            if ( x == 8 ) {
                JOptionPane.showMessageDialog(null, "Data Sudah Penuh");
                keluar = false;
            } else {
                do {
                    x = x + 1; no_data = no_data + 1;
                    String hasil = "";
                    String nm = JOptionPane.showInputDialog("NAMA MAHASISWA");
                    nama[x] = nm;
                    
                    do {
                        try {
                            do{
                                String nu = JOptionPane.showInputDialog("NILAI UJIAN (0 - 100)");
                                uji = Integer.parseInt(nu);
                                lanjut = false;
                            } while( !(uji >= 0 & uji <= 100) );
                        } catch(Exception e) {
                            lanjut = true;
                            JOptionPane.showMessageDialog(null, "ERROR, DATA SALAH INPUT");
                        }
                    } while(lanjut);
                    
                    nilai[x] = uji;
                    
                    if ( uji <= 30 ) {
                        grade = "E";
                    } else if ( uji <= 59 ) {
                        grade = "D";
                    } else if ( uji <= 70 ) {
                        grade = "C";
                    } else if ( uji <= 80 ) {
                        grade = "B";
                    } else {
                        grade = "A";
                    }
                    
                    do {
                        try {
                            do {
                                String sem = JOptionPane.showInputDialog("IPK SEMESTER [0-4.00]");
                                sem_ipk = Float.parseFloat(sem);
                                lewat = false;
                            } while( !(sem_ipk >= 0 & sem_ipk <= 4.00) );
                        } catch(Exception e) {
                            lewat = true;
                            JOptionPane.showMessageDialog(null, "ERROR, DATA SALAH INPUT");
                        }
                    } while(lewat);
                    
                    ipk[x] = sem_ipk;
                    
                    if ( sem_ipk >= 2.00 ) {
                        ket = "LULUS";
                    } else {
                        ket = "TIDAK LULUS";
                    }
                    
                    hasil += "NO : " + no_data + "\n";
                    hasil += "  HASIL DATA MAHASISWA  \n";
                    hasil += "NAMA  = " + nama[x] + "\n";
                    hasil += "NILAI = " + nilai[x] + "\n";
                    hasil += "GRADE = " + grade + "\n";
                    hasil += "IPK   = " + ipk[x] + " KET " + ket + "\n";
                    JOptionPane.showMessageDialog(null, hasil, "DATA MAHASISWA", JOptionPane.INFORMATION_MESSAGE);
                    
                    do {
                        lagi = JOptionPane.showInputDialog("INPUT DATA [Y/T]");
                        if ( x == 7 ) {
                            JOptionPane.showMessageDialog(null, "DATA SUDAH PENUH");
                            lagi = "T";
                        }
                    } while( !(("y".equals(lagi) | ("Y".equals(lagi)) | ("t".equals(lagi)) | ("T".equals(lagi)))) );
                } while(("y".equals(lagi)) | ("Y".equals(lagi)));
            }
            keluar = false;
        } while(keluar);
        
        t_data = x + 1;
        h = t_data % 3;
        
        if ( h == 0 ) {
            jh = t_data / 3;
        } else {
            jh = (t_data / 3) + 1;
        }
        
        if ( jh == 1 ) {
            x1 = 0;
            x2 = x;
        } else {
            x1 = 0;
            x2 = 2;
        }
        
        no = 0;
        for ( int y = 1; y <= jh; y++ ) {
            tampil ="";
            tampil += "Hal = " + y + "\n";
            tampil += "         LAPORAN HASIL PENILAIAN MAHASISWA      \n";
            tampil += "================================================\n";
            tampil += "NO   NAMA    NILAI   GRADE   IPK     KETERANGAN \n";
            tampil += "================================================\n";
            tot_nil = 0;
            tot_ipk = 0;
            c = 0;
            
            if ( y == jh ) {
                x2 = x;
            }
            
            for ( int z = x1; z <= x2; z++ ) {
                if ( nilai[z] <= 30 ) {
                    grade = "E";
                } else if ( nilai[z] <= 59 ){
                    grade = "D";
                } else if ( nilai[z] <= 70 ) {
                    grade = "C";
                } else if ( nilai[z] <= 80 ) {
                    grade = "B";
                } else {
                    grade = "A";
                }
                
                if ( ipk[z] >= 2.00 ) {
                    ket = "LULUS"; ll = ll + 1;
                } else {
                    ket = "TIDAK LULUS"; tl = tl + 1;
                }
                
                tot_nil = tot_nil + nilai[z];
                tot_ipk = tot_ipk + ipk[z];
                no = no + 1;
                tampil += " " + no + " " + nama[z] + " " + nilai[z] + " " + grade + " " + ipk[z] + " " + ket + "\n";
                c = c + 1;
            }
            
            rata_nil = tot_nil / c;
            rata_ipk = tot_ipk / c;
            
            tampil += "====================================\n";
            tampil += " RATA RATA NILAI  = " + rata_nil + "\n";
            tampil += " RATA RATA IPK    = " + rata_ipk + "\n";
            tampil += " LULUS            = " + ll + "\n";
            tampil += " TIDAK LULUS      = " + tl + "\n";
            tampil += "====================================\n";
            
            JOptionPane.showMessageDialog(null, tampil, "LAPORAN HASIL DATA MAHASISWA", JOptionPane.INFORMATION_MESSAGE);
            x1 = x1 + 3;
            x2 = x2 + 3;
        }
    }
    // end function pertemuan 12
    
    // start function pertemuan 13
    static void pertemuan13() {
        System.out.print("Masukkan Warna Mobil = ");
        warna = keyboard.next();
        System.out.print("Masukkan Merk Mobil  = ");
        merk = keyboard.next();
        
        // membuat objek
        TugasAP mobilsaya = new TugasAP();
        mobilsaya.maju();
        mobilsaya.mundur();
    }
    // end function pertemuan 13

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        do {
            showMenu();
        } while (isRunning);
    }
    
}
