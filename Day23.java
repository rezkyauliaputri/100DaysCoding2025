package day23;

import java.util.Scanner;

public class Day23 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.println("masukkaan panjang persegi : ");
        float panjang = p.nextFloat();
        
        System.out.println("masukkan lebar persegi panjang : ");
        float lebar = p.nextFloat();
        
        float luas = panjang * lebar;
        System.out.println("menampilkan luas persegi : " + luas);
    }
    
}
