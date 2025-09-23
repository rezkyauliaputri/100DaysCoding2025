package day16;

import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan nilai1: ");
        int angka1 = input.nextInt();
        
        System.out.print("masukkan nilai2: ");
        int angka2 = input.nextInt();
        
       // perkalian
       int hasilSatu = angka1 * angka2;
        System.out.println("hasilpekalian: " + hasilSatu);
        
        // pembagian
       int hasilDua = angka1 / angka2;
        System.out.println("hasil pembagian: " + hasilDua);
       
        
    }
    
}
