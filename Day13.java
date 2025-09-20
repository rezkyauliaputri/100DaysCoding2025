
package scannerbiodata;

import java.util.Scanner;
public class ScannerBiodata {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // nomor 1 
        //file1
        //package class;
        
        //file2
        //public class tugas2 {}
        
        //public static void main(String[]args) {}
        
        // nomor 2
        //deklarasi tipe data
        int umur;
        long saudara;
        byte hp;
        short sahabat;
        double panjang;
        float berat;
        char karakter;
        boolean betul;
        String alamat;
        //inisialisasi 
         umur = 19;
         saudara = 1;
         hp = 2;
         sahabat = 6;
         panjang = 165.0;
         berat = 48.0f;
         karakter = 's';
         betul  = true;
        alamat = "lakejo";
        //update variabel 
        umur = 17;
        saudara = 2;
        hp = 1;
        sahabat = 8;
        panjang = 166.0;
        berat = 47.0f;
        karakter = 'p';
        betul = false;
        alamat = "wono";
                
        // deklarasi membuat atau menentukan type data dan membuat variabel
        // inisialisasi  menambahkan nilai variabel yang sudah di deklarasikan 
        // update variabel itu mengupdate nilai yang telah diberikan di atas 
        
    
    

       // nomor 3

     
        System.out.print("======Biodata======\n");
        System.out.print("masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("masukkan umur: ");
        int umur1 = input.nextInt();
        System.out.print("masukkan nim: ");
        String nim = input.nextLine();
        nim = input.nextLine();
        System.out.print("masukkan rajin :");
        boolean rajin = input.nextBoolean();
        System.out.print("masukkan tinggi Badan: ");
        double TinggiBadan = input.nextDouble();
        System.out.print("masukkan Berat Badan: ");
        float BeratBadan = input.nextFloat();
        System.out.print("masukkan kelas: ");
        char kelas = input.next().charAt(0);
        System.out.print("masukkan alamat: ");
        String alamat1 = input.next();
        System.out.print("====== Biodata ======" + "\n");
        System.out.print(" Nama\t\t:\t " + nama + "\n");
        System.out.print(" Umur\t\t:\t " + umur + " Tahun" +"\n");
        System.out.print(" NIM\t\t:\t " + nim + "\n");
        System.out.print(" Rajin\t\t:\t " + rajin + "\n");
        System.out.print(" Tinggi Badan\t:\t " + TinggiBadan + " cm " + "\n");
        System.out.print(" Berat Badan\t:\t" + BeratBadan + " kg " + "\n");
        System.out.print(" kelas\t\t:\t " + kelas + "\n");
        System.out.print(" Alamat\t\t:\t " + alamat + "\n");
        
        
        
                
                
                
            
                
        
    }
    
}
