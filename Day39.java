
package day39;

import java.util.Scanner;

public class Day39 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        int pilihan;
        
        System.out.println(" == Kartika Cell == ");
        System.out.println(" 1.Iphone   ");
        System.out.println(" 2.Samsung  ");
       
        System.out.print("Masukkan pilihan : ");
        pilihan = p.nextInt();
        int aul;
        
        if (pilihan == 1) {
            System.out.println("== Type hp  == ");
            System.out.println("1. Iphone 11   ");
            System.out.println("2. Iphone 17  ");
            System.out.print("Masukkan pilihan : ");
            aul = p.nextInt();
            if (aul == 1){ 
                System.out.println(" Iphone 11 = 6.000.000 ");
                
            }else if (aul == 2) {
                System.out.println(" Iphone 17 = 21.000.000 "); 
            }else 
                System.out.println("Stok tidak tersedia ");     
            
        }else if (pilihan == 2) {
            System.out.println(" == Type hp == ");
            System.out.println("1. Samsung A15  ");
            System.out.println("2. Samsung A20  ");
            System.out.print("Masukkan pilihan :  ");
            aul = p.nextInt();
            if (aul == 1) {
                System.out.println(" Samsung A15 = 2.000.000 ");      
                
            }else if (aul == 2) {
                System.out.println("Samsung A20 = 3.000.000 ");
            } else{
                System.out.println("Stok tidak tersedia ");
            }
                
        }else{
            System.out.println("Merek hp tidak ada ");
        
    }
    
}
}
