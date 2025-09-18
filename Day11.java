package Day11.java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int tanggal_lahir;
        char gender;
        boolean sehat;
        long umur;
        byte saudara;
        double tinggi;
        short hp;
        float bb;
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan tanggal_lahir: ");
        tanggal_lahir = input.nextInt();
        System.out.print("Masukkan gender: ");
        gender = input.next().charAt(0);
        System.out.print("Masukkan sehat: ");
        sehat = input.nextBoolean();
        System.out.print("Masukkan umur: ");
        umur = input.nextLong();
        System.out.print("Masukkan saudara: ");
        saudara = input.nextByte();
        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextDouble();
        System.out.print("Masukkan hp: ");
        hp = input.nextShort();
        System.out.print("Masukkan bb: ");
        bb = input.nextFloat();
        /*scanner itu meminta pengguna memasukkan 
         data melalui keyboard.scanner juga membaca input dari pengguna
         */
        
        
    }
    
}
