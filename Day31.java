
package day31.java;

import java.util.Scanner;

public class Day31Java {

   
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.print("nilai ulangan : ");
        int ulangan = p.nextInt();
        
        System.out.print("nilai kkm : ");
        int kkm = p.nextInt();
        
        boolean lulus = (ulangan >= 95) && (kkm >= 75);
        System.out.println("apakah dia  mencapai ke dua nilai tersebut?:  " + lulus);
        
        
        
       
            }
    
}
