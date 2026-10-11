package Pertemuan5;

import java.util.Scanner;

public class Pemilihanif24 {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);

        System.out.println("--- cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = ostha.nextBoolean();
        
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverivikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
            
        } else {
            System.out.println("Registrasi ditolak");
            System.out.println("Silakan lunasi UKT terlebih");
        }
    }
    
}


    

