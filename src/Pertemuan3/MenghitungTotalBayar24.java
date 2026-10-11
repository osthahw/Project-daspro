package Pertemuan3;

import java.util.Scanner;

public class MenghitungTotalBayar24 {

    public static void main(String[] args) {

        Scanner ostha = new Scanner(System.in);

        double harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        System.out.print("Masukkan harga barang: ");
        harga = ostha.nextInt();

        potongan = diskon * harga;
        jml_bayar = harga - potongan;

        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);

        ostha.close();
    }
}