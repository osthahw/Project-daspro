package pertemuan10;
import java.util.Scanner;

public class Tugas324 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah toko: ");
        int jmlToko = scan.nextInt();
        
        int totalBarangSemua = 0;
        int maxBarang = -1;
        int tokoTerbanyak = 1;
        
        for (int t = 1; t <= jmlToko; t++) {
            System.out.println("--- Data Toko ke-" + t + " ---");
            System.out.print("Masukkan jumlah pelanggan: ");
            int jmlPelanggan = scan.nextInt();
            
            int totalBarangToko = 0;
            
            for (int p = 1; p <= jmlPelanggan; p++) {
                System.out.print("  Jumlah barang dibeli pelanggan " + p + ": ");
                int barang = scan.nextInt();
                
                while (barang < 0) {
                    System.out.print("  Tidak boleh negatif! Masukkan ulang: ");
                    barang = scan.nextInt();
                }
                
                totalBarangToko += barang;
            }
            System.out.println("Toko " + t + " -> pelanggan: " + jmlPelanggan + ", total barang: " + totalBarangToko);
            
            totalBarangSemua += totalBarangToko;
            
            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = t;
            }
        }
        
        System.out.println("==================================");
        System.out.println("Total barang seluruh toko: " + totalBarangSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
    }
}
