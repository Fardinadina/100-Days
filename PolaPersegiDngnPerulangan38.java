package polapersegidngnperulangan38.java;
import java.util.Scanner;
public class PolaPersegiDngnPerulangan38.java {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int jml = masuk.nextInt();
        for (int i = 1; i <= jml; i++){
               for(int j = 1; j < jml; j++){
                    System.out.print("o ");
                }
            System.out.println("o ");
        }
        System.out.println("");

    }
    
}
