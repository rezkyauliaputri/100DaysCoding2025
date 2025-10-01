
package day24;

import java.util.Scanner;

public class Day24 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        // latihan program  luas lingkaran
        System.out.print("masukkan jari jari lingkaran : ");
        double r = n.nextDouble();
        
        double luas = Math.PI * r * r;
        System.out.println("luas lingkaran = " + luas);
        
    }
    
}
