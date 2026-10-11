package kuis;

import java.util.Scanner;

public class osthahelga24 {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);
        
        int uangyangdibayar;
        int totalBelanja;
        int kembalian;
        int jumlahLembarKembalian;
        int presentase;
        
        System.out.println("Masukkan uang yang dibayar");
        uangyangdibayar = ostha.nextInt();

        System.out.println("Masukkan jumlah total belanja");
        totalBelanja = ostha.nextInt();

        System.out.println("kembalian");
        kembalian = ostha.nextInt();

        System.out.println("jumlahLembarKembalian");
        jumlahLembarKembalian = ostha.nextInt();;

        jumlahLembarKembalian = uangyangdibayar - totalBelanja;
        presentase =  kembalian * jumlahLembarKembalian;

        System.out.println("Persentase kembalian - kembalian");

    }
    
}
