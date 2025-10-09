
package day32.java;

import java.util.Scanner;


public class Day32Java {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("nilai ppkn : ");
        int ppkn = inp.nextInt();
        
        System.out.print("nilai kkm : ");
        int kkm = inp.nextInt();
        
        boolean lulus = (ppkn >= 90) || ( kkm >= 78);
        System.out.println("apakah dia  mencapai ke dua nilai tersebut?:  " + lulus);
    }
    
}
