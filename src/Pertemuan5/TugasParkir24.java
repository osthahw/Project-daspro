package Pertemuan5;

import java.util.Scanner;

public class TugasParkir24 {
     public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);


        System.out.println("Masukkan Lama Parkir: ");
        
        double LamaParkir = ostha.nextDouble(); 
        
        double tarifTotal;

        if (LamaParkir <= 2) {
            tarifTotal = 2000;
            System.out.println("Tarif : "+tarifTotal);

        }else {
            tarifTotal=2000+1000*(LamaParkir-2);
            System.out.println("Tarif : "+tarifTotal);
        }
    }  
}
