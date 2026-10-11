package Pertemuan5;

import java.util.Scanner;

public class Tugas1Pemilihan24 {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);

        System.out.println("--- cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = ostha.nextBoolean();
        
        String pesan = (uktLunas) ? "Pembayaran UKT Terverivikasi\nSilakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak\nSilakan lunasi UKT terlebih dahulu";

        System.out.println(pesan);
    }
     
}
    

