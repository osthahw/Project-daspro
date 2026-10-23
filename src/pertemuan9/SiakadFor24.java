//• Jumlah mahasiswa (batas perulangan FOR) = 8 + (24 mod 5) → gantikan angka 10 pada soal
//• Batas kelulusan pada Pertanyaan no. 4 (modifikasi kode) = 55 + (24 mod 11) → gantikan
//  angka 60 pada soal
// P = 12
// modif P = 57
package pertemuan9;
import java.util.Scanner;
public class SiakadFor24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lulus=0,tidakLulus=0;
        double nilai,tertinggi = 0,terendah = 100;

        for (int i = 1; i <= 12;i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >=57) {
                lulus++;
            }else{
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah); 
        System.out.println("Jumlah mahasiswa lulus: " + lulus); 
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
    }    
}
