package Day12.java;
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        System.out.print(" masukkan nama: ");
        String nama = input.nextLine();
        
        System.out.print(" masukkan nim: ");
        String nim = input.nextLine();
        
        System.out.print(" masukkan alamat: ");
        String alamat = input.nextLine();
        
        System.out.print(" masukkan umur: ");
        int umur = input.nextInt();
        
        System.out.print(" masukkan kelas: ");
        char kelas = input.next().charAt(0);
        
        System.out.print(" masukkan berat: ");
        float berat = input. nextFloat();
        
        System.out.print(" masukkan tinggi: ");
        double tinggi = input.nextDouble();
        
        System.out.println();
        
        System.out.println("nama \t\t: " + nama);
        System.out.println("nim \t\t: " + nim);
        System.out.println("umur \t\t: " + umur);
        System.out.println("kelas \t\t: " + kelas + " informatika ");
        System.out.println("alamat \t\t: " + alamat);
        System.out.println("berat \t\t: " + berat);
        System.out.println("tinggi \t\t: " + tinggi + " cm ");
        
        //hari ini saya commit biodata saya menggunakan beberapa type data yaitu:
        // String,int,double,float dan char
        // \t\t untuk menyamaratakan =
        
        
    }
    
}
    
