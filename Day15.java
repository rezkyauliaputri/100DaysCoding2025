
package day15;

import java.util.Scanner;

public class Day15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // operator aritmatika penjumlahan(+) dan pengurangan (-)
        System.out.print("masukkan angka1: ");
        int angka1 = input.nextInt();
        
        System.out.print("masukkan angka2: ");
        int angka2 = input.nextInt();
        
       // penjumlahan
       int hasilSatu = angka1 + angka2;
        System.out.println("hasilpenjumlahan: " + hasilSatu);
        
        // pengurangan 
       int hasilDua = angka1 - angka2;
        System.out.println("hasil pengurangan: " + hasilDua);
        
        
        
        
        
    }
    
}
