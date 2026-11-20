//Percobaan 4 Bagian B (uji wajib tambahan)
//elemen dasar array (B) 
//20 + (24 mod 60) = 44
package pertemuan11;
import java.util.Arrays;
public class SortNilai24 {
    public static void main(String[] args) {
        int[] nilai = {44, 59, 36, 74, 24, 49};
        System.out.println("Sebelum diurutkan: " + Arrays.toString(nilai));

        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.println("Sesudah diurutkan: " + Arrays.toString(nilai));
    }
}
