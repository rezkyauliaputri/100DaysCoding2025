package day34;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.print("Nilai a = ");
        int a = p.nextInt();
        System.out.print("Nilai b = ");
        int b = p.nextInt();
        System.out.print("Nilai c = ");
        int c = p.nextInt();
        
        a = a + (b * c);
        System.out.println("Nilai akhir = "+a);
        
        int bagi = a / b;
        
        boolean hasil = (a%2 == 0 && a > c || (a-b) <= 10);
        System.out.println("Hasil logika = " + hasil);
        
        
    }
    


    }
    
