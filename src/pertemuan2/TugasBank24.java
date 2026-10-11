package pertemuan2;

import java.util.Scanner;

public class TugasBank24 {
public static void main(String[] args) {
    Scanner ostha = new Scanner(System.in);

    int gajiPokok, tunjanganAnak, jumlahAnak;
    double totalT;
    double potonganP = 0.1;
    double totalAkhirG;
    double totalDanaP;

    System.out.println("Masukkan Gaji Pokok");
    gajiPokok = ostha.nextInt();
    System.out.println("Masukkan besaran tunjangan anak");
    tunjanganAnak = ostha.nextInt();
    System.out.println("Masukkan jumlah anak");
    jumlahAnak = ostha.nextInt();

    totalT = tunjanganAnak*jumlahAnak;
    totalDanaP = gajiPokok*potonganP;
    totalAkhirG = totalT+gajiPokok-totalDanaP;

    System.out.println("total gaji bersih: " + totalAkhirG);


}
}