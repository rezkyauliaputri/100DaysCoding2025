package Day37;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Masukkan angka:");
        int angka = in.nextInt();
        System.out.print("Masukkan nilai:");
        int nilai = in.nextInt();
        
        int hasil = angka * nilai;
        System.out.println("Hasil perkalian = " + hasil);
        
        if(hasil % 2 == 0) {
            System.out.println("hasil perkalian adalah angka genap");
        }else{
            System.out.println("hasil perkalian adalah angka ganjil");
        }
        
        
    }
    
}
            
        
    
    


    
    
