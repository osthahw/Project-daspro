package Pertemuan3;

import java.util.Scanner;

public class SoalKedua24 {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);

        int lembar;
        int biayaCetak;
        int biayaPenjilidan;
        Double totalBiaya;

        System.out.println("Masukkan lembar");
        lembar = ostha.nextInt();
        System.out.println("Masukkan biaya perlembar");
        biayaCetak = ostha.nextInt();
        System.out.println("Masukkan biaya penjilidan");
        biayaPenjilidan = ostha.nextInt();

        totalBiaya =(double) (lembar * biayaCetak) + biayaPenjilidan;

        System.out.println("Total biaya yang harus dibayar: " + totalBiaya);

    }
}
