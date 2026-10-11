package Pertemuan5;

import java.util.Scanner;

public class TugasAntrean24 {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);

        System.out.println("---Masukkan Layanan---");
        System.out.println("1. Legalisir Ijazah");
        System.out.println("2. Surat Keterangan Aktif Kuliah");
        System.out.println("3. Pembayaran UKT");
        System.out.println("4. Pembayaran Cuti Sekolah");
        int layanan = ostha.nextInt();

        switch (layanan) {
            case 1:
              System.out.println("Legalisir ijazah Loket A");
              break;
            case 2:
              System.out.println("Surat Keterangan Aktif Kuliah Loket B");
              break;
            case 3: 
              System.out.println("Pembayaran UKT Loket C");
              break;
            case 4:
              System.out.println("Pembayaran Cuti Sekolah Loket D");
              break;
            default:
              System.out.println("Layanan Tidak Tersedia");    

        }
    }
}

    

