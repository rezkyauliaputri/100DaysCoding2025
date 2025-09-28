
package day21;

public class Day21 {

   public static void main(String[] args) {
       short pu = 15;
       short pi = 25;
       System.out.println("sebelum ditukar : pu = " + pu + ",pi = "+ pi);
       
       // penukaran variabel
       short piu = pu;
       pu = pi;
       pi = piu;
      System.out.println("setelah ditukar : pu = " + pu + ",pi= "+ pi);
       
       
       int a = 10;
       int b = 5;
       System.out.println("sebelum ditukar a: " + a + ",b: " + b);
       a = a + b;
       b = a - b;
       a = a - b;
       System.out.println("setelah bertukar a: " + a + ", b: " + b);
               
       
       
       
               
        
    }
    
}
