

package day43;

import java.util.Scanner;

public class Day43 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();
        
        if (angka >= 0 && angka < 10 && angka %2 == 0) {
            System.out.print(angka + " adalah angka satuan genap");
        }else if (angka >= 0 && angka < 10) {
            System.out.print(angka + " adalah angka satuan ganjil");
        }else if (angka >= 10 && angka <= 99 && angka %2 == 0) {
            System.out.print(angka + " adalah angka puluhan genap");
        }else if (angka >= 10 && angka <= 99) {
            System.out.print(angka + " adalah angka puluhan ganjil");
        }else if (angka >= 100 && angka <= 999 && angka %2 == 0) {
            System.out.print(angka + " adalah angka ratusan genap");
        }else if (angka >= 100 && angka <= 999) {
            System.out.print(angka + " adalah angka ratusan ganjil");
        }
        if (angka < 0) {
            System.out.println("Angka tidak boleh negatif");
        }
        if (angka %3 == 0 && angka %5 == 0 && angka >= 0) {
            System.out.println(" yang bisa dibagi 3 dan 5");
        }else if (angka %3 == 0 && angka >= 0) {
            System.out.println(" yang bisa dibagi 3");
        }else if (angka %5 == 0 && angka >= 0) {
            System.out.println(" yang bisa dibagi 5");
        }
        
    }
    
}

    
    


    
    

