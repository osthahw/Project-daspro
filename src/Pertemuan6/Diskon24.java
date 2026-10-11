package Pertemuan6;

import java.util.Scanner;

public class Diskon24 {
    public static void main(String[] args) {
         Scanner ostha = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (Kamus/Novel/Lainnya): ");
        String jenisBuku = ostha.nextLine().trim();

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = ostha.nextInt();

        int diskonBuku;

        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            diskonBuku = 12;
            if (jumlahBuku > 2) {
                diskonBuku = diskonBuku + 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            diskonBuku = 5;
            if (jumlahBuku > 3) {
                diskonBuku = diskonBuku + 2;
            } else {
                diskonBuku = diskonBuku + 1;
            }
        } else {
            if (jumlahBuku > 3) {
                diskonBuku = 3;
            } else {
                diskonBuku = 0;
            }
        }

        System.out.println("Jumlah diskon buku = " + diskonBuku + "%");
    }
}
