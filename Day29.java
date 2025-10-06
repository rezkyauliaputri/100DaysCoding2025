package Day29.java;

import java.util.Scanner;
public class Main {
    
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("angka p : ");
        int p = inp.nextInt();
        
        System.out.print("angka pi :");
        int pi = inp.nextInt();
        
        System.out.println(p > pi);
        System.out.println(p < pi);
        
    }
    
}
