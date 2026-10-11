package Pertemuan4;

import java.util.Scanner;

public class SIAKAD24 {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);

        String nama;
        String nim;
        char kelas;
        int noAbsen;
        Double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        String nilaiHuruf, kualifikasi;
        double nilaiSetara;

        System.out.println("Masukkan nama");
        nama = ostha.nextLine();
        System.out.println("Masukkan NIM");
        nim = ostha.nextLine();
        System.out.println("Masukkan kelas");
        kelas = ostha.next().charAt(0);
        System.out.println("Masukkan nomor absen");
        noAbsen = ostha.nextInt();
        System.out.println("Masukkan nilai kuis");
        nilaiKuis = ostha.nextDouble();
        System.out.println("Masukkan nilai tugas");
        nilaiTugas = ostha.nextDouble();
        System.out.println("Masukkan nilai ujian");
        nilaiUjian = ostha.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        if(nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "B+";
            nilaiSetara = 2;
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";
        }

        System.out.println();
        System.out.println("Mahasiswa dengan nama " + nama + "(NIM " + nim + ") kelas " + kelas + " nomor absen " + noAbsen);

        System.out.printf("Nilai akhir: %.6f%n", nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiSetara);
        System.out.println("Kualifikasi: " + kualifikasi);

        ostha.close();

    }
    
}
