package Pertemuan4;

import java.util.Scanner;

public class PemilihanBiilangan24 {
    public static void main(String[] args) {
       Scanner ostha = new Scanner(System.in);

        System.out.println("Masukkan sebuah angka: ");
        int angka = ostha.nextInt();

        String hasil = angka % 2 == 0 ? "genap" : "ganjil";
       
        System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        
    }
}