package day22;

import java.util.Scanner;

public class Day22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi persegi : ");
        double sisi = in.nextDouble();

        double luas = sisi * sisi;
        System.out.println("Luas dari sebuah persegi dengan panjang sisi " + sisi + " adalah :" + luas);

    }
}
