//Tugas 2 (uji wajib) 
//jumlah item dipesan 
//2 + (24 mod 4) = 2
//Tugas 2 (uji wajib) 
//indeks menu yang wajib dipesan
//24 mod 7 = 3
package pertemuan11;
import java.util.Scanner;
public class Tugas224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.print("Cari menu (ketik nama menu): ");
        String cari = sc.nextLine();
        int idxCari = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                idxCari = i;
                break;
            }
        }

        if (idxCari != -1) {
            System.out.println("Tersedia: " + menu[idxCari] + " (Rp " + harga[idxCari] + ")");
        } else {
            System.out.println("Menu '" + cari + "' tidak tersedia.");
        }

        System.out.print("Masukkan jumlah item yang dipesan: ");
        int jmlPesan = sc.nextInt();
        sc.nextLine(); 

        String[] pesanan = new String[jmlPesan];
        int[] hargaPesanan = new int[jmlPesan];
        int totalBiaya = 0;

        for (int i = 0; i < jmlPesan; i++) {
            while (true) {
                System.out.print("Nama menu pesanan ke-" + (i + 1) + ": ");
                String pilih = sc.nextLine();

                int ketemu = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(pilih)) {
                        ketemu = j;
                        break;
                    }
                }

                if (ketemu != -1) {
                    pesanan[i] = menu[ketemu];
                    hargaPesanan[i] = harga[ketemu];
                    totalBiaya += harga[ketemu];
                    break;
                } else {
                    System.out.println("Menu tidak ada di daftar, coba ketik ulang.");
                }
            }
        }

        System.out.println("=== DAFTAR PESANAN ===");
        for (int i = 0; i < jmlPesan; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("=====================");
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}