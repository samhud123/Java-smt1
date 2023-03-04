/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjualbeli;
import javax.swing.*;
/**
 *
 * @author STMIK-VI-35
 */
public class TugasJualBeli {

    public static String hasil, laporan;
    public static int no_data;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        no_data = 0;
        String tanggal, lagi ="y", lapor="";
        String namaBarang[];
        namaBarang = new String[8];
        int kode[];
        kode = new int[8];
        int quantity[];
        quantity = new int[8];
        int harga[];
        harga = new int[8];
        int jhBarang[];
        jhBarang = new int [8];
        int x = -1, diskon, jumlahBayar, jumlahHarga2 = 0, jumlahHarga, z = 0;
        boolean lanjut = true, keluar =true;
        
        do {
            tanggal = JOptionPane.showInputDialog("Tanggal Beli : ");
            do {
                do {
                    
                    x = x +1; no_data = no_data + 1;
                    String kb = JOptionPane.showInputDialog("Kode Beli : ");
                    kode[x] = Integer.parseInt(kb);

                    String nb = JOptionPane.showInputDialog("Nama Barang : ");
                    namaBarang[x] = nb;

                    String hb = JOptionPane.showInputDialog("Harga Barang : ");
                    harga[x] = Integer.parseInt(hb);
                    
                    String qty = JOptionPane.showInputDialog("Quantity : ");
                    quantity[x] = Integer.parseInt(qty);
                    
                    jumlahHarga = harga[x] * quantity[x];  
                    
                    jhBarang[x] = jumlahHarga;
                    
                    jumlahHarga2 += jumlahHarga;
                
                } while (lanjut = false);
                
                hasil += "NO : "+no_data+"\n";
                hasil += " HASIL DATA PENJUALAN \n";
                hasil += " TANGGAL BELI = "+ tanggal+"\n";
                hasil += " KODE BELI    = "+ kode[x]+"\n";
                hasil += " NAMA BARANG  = "+ namaBarang[x] +"\n";
                hasil += " HARGA BARANG = Rp. "+ harga[x]+"\n";
                hasil += " QUANTITY     = "+ quantity[x]+"\n";
                hasil += " JUMLAH BAYAR = Rp. "+jumlahHarga+"\n";
                JOptionPane.showMessageDialog(null,hasil,"DATA PENJUALAN",JOptionPane.INFORMATION_MESSAGE);

                do {
                    lagi = JOptionPane.showInputDialog("TAMBAH DATA BARANG [Y/T] ");
                    if (x == 7){
                        JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
                        lagi ="T";
                    } 
                }while (!(("y".equals(lagi)) | ("Y".equals(lagi)) | ("t".equals(lagi)) | ("T".equals(lagi))));

            } while (("y".equals(lagi)) | ("Y".equals(lagi)));
        
            keluar = false;
        } while (keluar);
        
        lapor += " LAPORAN HASIL PENJUALAN \n";
        lapor += "==================================================\n";
        lapor += "TANGGAL = " + tanggal +"\n";
        lapor += "==================================================\n";
        lapor += "NO KODE NAMABARANG HARGA QUANTITY JUMLAH \n";
        lapor += "==================================================\n";
        
        for ( int y=0; y<=x; y=y+1 ) {
            z = z + 1;
            lapor += " "+z+" "+kode[y]+" " +namaBarang[y]+" "+harga[y]+" "+quantity[y] +" = Rp. "+ jhBarang[y] + "\n";
        }
        
        lapor += "==================================================\n";
        lapor += " TOTAL HARGA = Rp. "+jumlahHarga2+" \n";
        
        if ( jumlahHarga2 > 1000000 ) {
             diskon = 10000;
        } else {
            diskon = 0;
        }
        
        lapor += " DISKON = Rp. "+diskon+" \n";
        
        jumlahBayar = jumlahHarga2 - diskon;
        
        lapor += " TOTAL BAYAR = Rp. "+jumlahBayar+" \n";
        lapor += " ==================================================\n";
        JOptionPane.showMessageDialog(null,lapor,"LAPORAN HASIL PENJUALAN",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
    }
}
