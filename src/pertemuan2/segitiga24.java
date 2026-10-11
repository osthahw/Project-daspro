package pertemuan2;
import java.util.Scanner;
public class segitiga24 {
    public static void main(String[] args) {
      Scanner ostha = new Scanner(System.in);

      int alas, tinggi;
      float luas;

      System.out.print("Masukan alas");
      alas = ostha.nextInt();
      System.out.print("Masukan tinggi");
      tinggi = ostha.nextInt();

      luas = alas * tinggi / 2;

      System.out.println("Luas segitiga: " + luas);
    }
}
