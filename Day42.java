package Day42;
import java.util.Scanner;
public class Main {
    
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkkan nama: ");
        String nama = in.nextLine();
        System.out.println("=========== PEKERJAAN =============");
        System.out.println("1. PNS");
        System.out.println("2. Freelancer");
        System.out.println("===================================");
        System.out.print("Pilih pekerjaan: ");
        int pilih = in.nextInt();
        System.out.print("Penghasilan: ");
        int hasil = in.nextInt();
        System.out.println("===================================");

        int pajak;
        double potongan;
        double bersih;

        if (pilih == 1) {
            if (hasil >= 5000000) {
                pajak = 15;
            } else if (hasil >= 3000000 && hasil < 5000000) {
                pajak = 10;
            } else {
                pajak = 0;
            }
            potongan = (pajak * hasil) / 100;
            bersih = hasil - potongan;
            System.out.println("Nama Pegawai\t\t: " + nama);
            System.out.println("Jenis pekerjaan\t\t: PNS");
            System.out.println("Penghasilan kotor\t: RP " + hasil);
            System.out.println("Pajak dikenakan\t\t: " + pajak + "%");
            System.out.println("Potongan\t\t\t: Rp " + potongan);
            System.out.println("Penghasilan bersih\t: Rp " + bersih);
        } else if (pilih == 2) {
            if (hasil >= 5000000) {
                pajak = 8;
            } else if (hasil >= 3000000 && hasil < 5000000) {
                pajak = 3;
            } else {
                pajak = 0;
            }
            potongan = (pajak * hasil) / 100;
            bersih = hasil - potongan;
            System.out.println("Nama Pegawai\t\t: " + nama);
            System.out.println("Jenis pekerjaan\t\t: Freelancer");
            System.out.println("Penghasilan kotor\t: RP " + hasil);
            System.out.println("Pajak dikenakan\t\t: " + pajak + "%");
            System.out.println("Potongan\t\t\t: Rp " + potongan);
            System.out.println("Penghasilan bersih\t: Rp " + bersih);
        }
    }
}
