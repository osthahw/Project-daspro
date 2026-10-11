package Pertemuan3;
import java.util.Scanner;

public class CicilanLaptop24 {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);

       int harga;
       int bulan;
       int uangMuka;
       double bunga = 0.02;
       double sisaHarga;
       double hargaPokok;
       double cicilan;
       double totalBunga;
       
       System.out.println("Masukkan harga laptop; Rp");
       harga = ostha.nextInt();
       System.out.println("Masukkan uang muka: Rp");
       uangMuka = ostha.nextInt();
       System.out.println("Masukkan lama cicilan (bulan):");
       bulan = ostha.nextInt();

       sisaHarga = harga - uangMuka;
       totalBunga = bunga * sisaHarga;
       hargaPokok = sisaHarga / bulan;
       cicilan = hargaPokok + totalBunga;

       System.out.println("Jumlah cicilan yang harus dibayarkan; " + cicilan);


    }
   
   
}
