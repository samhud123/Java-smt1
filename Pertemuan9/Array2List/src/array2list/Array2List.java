/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2list;
import java.util.ArrayList;
/**
 *
 * @author STMIK-VI-35
 */
public class Array2List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList mapel = new ArrayList();
        mapel.add("IPA");
        mapel.add("MTK");
        mapel.add("IPS");
        mapel.add("PEMDAS");
        mapel.add(2022);
        mapel.add(true);
        mapel.remove("MTK");
        System.out.println(mapel);
        System.out.println("Array Mapel Berisi " +
        mapel.size() + " item");
    }
}
