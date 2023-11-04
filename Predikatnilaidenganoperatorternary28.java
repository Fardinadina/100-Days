package predikatnilaidenganoperatorternary27;
import java.util.Scanner;
public class Predikatnilaidenganoperatorternary27 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = masuk.nextInt();
        String predikat =
                nilai >= 9 ? "Amat Baik":
                nilai >= 7 ? "Baik":
                nilai >= 5 ? "Cukup":
                "Kurang";
        System.out.println(predikat);
      






    }
    
}
