
package day24;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        System.out.print("masukkan jari jari lingkaran:");
        double r = n.nextDouble();
        
        final double h= 3.14;
        double luas = h * r * r;
        System.out.println("masukkan luas lingkaran:" + luas);
        
        
        
        
    }
    
}
