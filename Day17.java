
package day17.java;

import java.util.Scanner;

public class Day17Java {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // operator aritmatika modulus atau sisa bagi (%)
        
        System.out.print("masukkan angka p1: ");
        int p1  = input.nextInt();
        
        System.out.print("masukkan angka p2: ");
        int p2 = input.nextInt();
        
        int hasil = p1 % p2;
        System.out.println("hasil bagi:  " + hasil);
        
        
    }
    
}
