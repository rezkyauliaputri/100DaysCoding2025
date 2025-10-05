package day28;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("angka p : ");
        int p = s.nextInt();
        
        System.out.print("angka pi :");
        int pi = s.nextInt();
        
        System.out.println(p == pi);
        System.out.println(p != pi);
        
        
    }
    
}
