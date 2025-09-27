
package day20;

public class Day20 {

    public static void main(String[] args) {
        
        //mengubah type data primitif menjadi String ( non primitif )
        short pi = 42;
        String angka = String.valueOf(pi);
        System.out.println(angka);
        
        boolean rajin = true;
        String benar = String.valueOf(rajin);
        System.out.println(benar);
    }
    
}
