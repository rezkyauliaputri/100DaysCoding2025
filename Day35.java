
package day35;

import java.util.Scanner;

public class Day35 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.println("masukkan tinggi = ");
        double tinggi = p.nextDouble();
        
        if (tinggi >= 165) {
            System.out.println("saya sudah tinggi");
        }else{
            System.out.println("saya masih pendek");
            
        }
    }
    
}
