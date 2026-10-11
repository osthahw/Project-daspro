package Pertemuan5;

import java.util.Scanner;

public class Tugas2Pemilihan24 {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);

        System.out.println("Masukkan Jumlah SKS: ");
        int jumlahSKS = ostha.nextInt();

        if (jumlahSKS < 24) {
            System.out.println("KRS valid");

        } else {
            System.out.println("melebihi batas");
        }
    }
    
}
    
