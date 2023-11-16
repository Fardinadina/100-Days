package polasegitigadngnperulangan39;
import java.util.Scanner;
public class PolaSegitigaDngnPerulangan39 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int jml = masuk.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("output :");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 1; i <= jml; i++){
               for(int j = 1; j < i; j++){
                    System.out.print("o  ");
                }
            System.out.println("o");
        }
        System.out.println("");

    }
    
}
