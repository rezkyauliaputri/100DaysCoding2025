
package day33.java;

import java.util.Scanner;

public class Day33Java {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.print("masukkan angka1 : ");
        int angka1 = p.nextInt();
        
        System.out.print("masukkan angka2 : ");
        int angka2 = p.nextInt();
        
        boolean hasil = angka1 == angka2;
        boolean akhir = angka1 != angka2;
        
        System.out.printf("apakah %d sama dengan %d : %b \n",angka1,angka2,hasil);
        System.out.printf("apakah %d tidak sama dengan %d : %b \n",angka1,angka2,akhir);
        
        
    }
    
}
