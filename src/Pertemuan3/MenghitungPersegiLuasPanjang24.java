package Pertemuan3;

import java.util.Scanner;

public class MenghitungPersegiLuasPanjang24 {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        System.out.print("Masukkan panjang: ");
        panjang = ostha.nextInt();

        System.out.print("Masukkan lebar: ");
        lebar = ostha.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas persegi panjang adalah " + luas);

        ostha.close();
    }
}