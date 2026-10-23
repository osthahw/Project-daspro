//• Harga tiket = 40000 + (24 mod 6) × 2000 → gantikan Rp50.000 pada soal
//• Syarat diskon pertama = lebih dari (3 + (24 mod 3)) tiket, dengan diskon (8 + (24 mod 5))% →
//  gantikan "lebih dari 4 tiket, diskon 12%
//• Syarat diskon kedua = lebih dari (8 + (24 mod 4)) tiket, dengan diskon (15 + (24 mod 4))% →
//  gantikan "lebih dari 10 tiket, diskon 15%"
//  P = 24
//  
package pertemuan9;
import java.util.Scanner;
public class PenjualanTiketBioskop24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int hargaTiket = 40000;
        int totalTikTerj = 0;
        double totalPenjUang= 0;
        int jumlahTiket;

        while (true) {
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk selesai/keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan angka positif!");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 8) {
                diskon = 0.15; 
            } else if (jumlahTiket > 3) {
                diskon = 0.12; 

            double hargaKotor = jumlahTiket * hargaTiket;
            double totalBayarPelanggan = hargaKotor - (hargaKotor * diskon);

            totalTikTerj += jumlahTiket;
            totalPenjUang += totalBayarPelanggan;

            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total harga transaksi: Rp " + totalBayarPelanggan);
        }

        System.out.println("=== REKAP PENJUALAN HARI INI ===");
        System.out.println("Total tiket terjual: " + totalTikTerj);
        System.out.println("Total penjualan: Rp " + totalPenjUang);
        }
    }   
}
