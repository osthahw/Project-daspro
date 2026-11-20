//Tugas 1 (uji wajib) 
//jumlah nilai mahasiswa 
//5 + (24 mod 11) = 5 + 2 = 7
//Tugas 1 (uji wajib) 
//salah satu nilai yang diinput 
//24 mod 100 = 24
package pertemuan11;
import java.util.Scanner;
public class Tugas124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = sc.nextInt();
        int[] nilai = new int[jumlah];

        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        double rataRata = (double) total / jumlah;

        System.out.println("=== DAFTAR NILAI MAHASISWA ===");
        for (int i = 0; i < jumlah; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        System.out.println("=== RINGKASAN ===");
        System.out.println("Rata-rata       : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
    }   
}
