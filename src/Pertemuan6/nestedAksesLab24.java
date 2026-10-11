package Pertemuan6;

import java.util.Scanner;

public class nestedAksesLab24 {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa aktif? (True/False): ");
        mahasiswaAktif = ostha.nextBoolean();
        System.out.print("Apakah sedang disanksi? (True/False): ");
        sedangDisanksi = ostha.nextBoolean();
        System.out.print("Apakah punya izin dosen? (True/False): ");
        punyaIzinDosen = ostha.nextBoolean();
        System.out.print("Apakah asisten Lab? (True/False): ");
        asistenLab = ostha.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
    
}

    

