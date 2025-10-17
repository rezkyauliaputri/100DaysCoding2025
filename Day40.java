package Day40;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int aul = in.nextInt();
        System.out.print("Masukkan Operator: ");
        char k = in.next().charAt(0);
        System.out.print("Masukkan angka: ");
        int putri = in.nextInt();
        
        int hasil;
        if (k == '+') {
            hasil = aul + putri;
            System.out.println("Hasil penjumlahan dari " +aul+ "+" +putri+ " = " +hasil);
        }else if (k == '-') {
            hasil = aul - putri;
            System.out.println("Hasil pengurangan dari " +aul+ "-" +putri+" = " +hasil);
        }else if (k == '*') {
            hasil = aul * putri;
            System.out.println("Hasil perkalian dari " +aul+ "*" +putri+" = " +hasil);
        }else if (k == '/') {
            hasil = aul / putri;
            System.out.println("Hasil pembagian dari " +aul+ "/" +putri+" = " +hasil);
        }
         
    }

    }
    
