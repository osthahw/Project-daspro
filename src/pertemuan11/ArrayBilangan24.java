//Percobaan 1 (uji wajibtambahan)
//bil[0], bil[1], bil[2], bil[3]
//24 ; 32 ; −(1+(24 mod 7)) ; 20+(24 mod 15) = 24, 32, -4, 29
package pertemuan11;
import java.util.Arrays;

public class ArrayBilangan24 {
    public static void main(String[] args) {
        int[] bil = new int[4];
        
        bil[0] = 24;
        bil[1] = 32;
        bil[2] = -4;
        bil[3] = 29;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));
    }
}



