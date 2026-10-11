package pertemuan2;

import java.util.Scanner;

public class Segitiga24copy {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);

        int lebarT, panjangT, diameterK, sisi, luasPesergi;
        double luasTanah, phi = 3.14,jarijari, luaslingkaran, tanahYangTidakDigunakan, luasYangDigunakan;

        System.out.println("masukan lebar tanah : ");
        lebarT = ostha.nextInt();
   
        System.out.println("masukkan panjang tanah : ");
        panjangT = ostha.nextInt();
        System.out.println("masukkan diameter kolam : ");
        diameterK = ostha.nextInt();
        System.out.println("masukkan sisi taman bunga : ");
        sisi = ostha.nextInt();
        
            
        luasTanah = panjangT*lebarT;
        jarijari = diameterK / 2;
        luaslingkaran = phi*jarijari*jarijari;
        luasPesergi = sisi*sisi;
        luasYangDigunakan = luaslingkaran+luasPesergi;
        tanahYangTidakDigunakan = luasTanah-luasYangDigunakan;

        System.out.println("Jumlah luas tanah yang tidak digunakan : " + tanahYangTidakDigunakan);
        
    }

}