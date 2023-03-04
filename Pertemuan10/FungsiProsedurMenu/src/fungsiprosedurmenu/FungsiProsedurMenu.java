/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsiprosedurmenu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author STMIK-VI-35
 */
public class FungsiProsedurMenu {
    
    static boolean isRun = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    static void showMenu() throws IOException{
        System.out.println("========= MENU ========");
        System.out.println("[1] Satu");
        System.out.println("[2] Dua");
        System.out.println("[3] Tiga");
        System.out.println("[0] Exit");
        System.out.println("=========ooOOoo========");
        System.out.print("PILIH MENU -> ");
        
        int pilihMenu = Integer.valueOf(input.readLine());
        switch(pilihMenu){
            case 1:
                showSatu();
                break;
            case 2:
                showDua();
                break;
            case 3:
                showTiga();
                break;
            case 0:
                System.exit(0);
            break;
                default:
                System.out.println("Pilihan salah!");
        } 
    }
    static void showSatu(){
    System.out.println("Ini Prosedur Satu");
    }
    static void showDua(){
    System.out.println("Ini Prosedur Dua");
    }
    static void showTiga(){
    System.out.println("Ini Prosedur Tiga");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        do {
            showMenu();
        } while (isRun);
    } 
}
