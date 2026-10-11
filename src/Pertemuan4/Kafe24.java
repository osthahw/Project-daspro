package Pertemuan4;
import java.util.Scanner;
public class Kafe24 {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        System.out.print("Masukkan menu : ");
        menu = ostha.nextLine();
        System.out.print("Masukkan ukuran cup : ");
        ukuranCup = ostha.next().charAt(0);
        System.out.print("Masukkan jumlah : ");
        jumlah = ostha.nextInt();
        System.out.print("Masukkan keanggotaan (true/false) : ");
        keanggotaan = ostha.nextBoolean();
        double hargaMenu = 0;
        switch (menu.toLowerCase()){
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }
        double totalHarga = hargaMenu * jumlah;
        switch (ukuranCup){
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
        }
        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga -(diskon * totalHarga);
        System.out.println("item pembelian kopi : " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar : " + nominalBayar);
    }
}
