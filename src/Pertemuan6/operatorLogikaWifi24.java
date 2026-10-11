package Pertemuan6;

import java.util.Scanner;

public class operatorLogikaWifi24 {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);
        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = ostha.nextBoolean();

        System.out.print("Apakah pengguna dosen? (True/False): ");
        dosen = ostha.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (True/False): ");
        akunDiblokir = ostha.nextBoolean();

        if ((mahasiswa && dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }
    }
    
}
    

