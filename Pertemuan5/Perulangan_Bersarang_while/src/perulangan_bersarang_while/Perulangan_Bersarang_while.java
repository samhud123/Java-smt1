/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan_bersarang_while;

/**
 *
 * @author STMIK-I
 */
public class Perulangan_Bersarang_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max_loop = 5;	
        int i = 1, j, k, l;
        while(i <= max_loop) 
        {
            j = 1;
            while (j<=i)
            {
                System.out.print(j+ " ");
                j++;
            }
            System.out.println();
            i++;
        }
        k = max_loop-1;
            while(k >= 1)
            {
                l = 1;
                while(l <= k)
                {
                    System.out.print(l+" ");
                    l++;
                }
                System.out.println();
                k--;
            }
    }
    
}
