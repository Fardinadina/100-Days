package deretfibonaccidngnforloop40;
import java.util.Scanner;
public class DeretFibonacciDngnForLoop40 {
   public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);
        int  f1 = 0;
        int  f2 = 1;
        System.out.print("jumlah angka = ");
        int n = masuk.nextInt();
        
        int fn;
        System.out.println("Deret Fibonacci");
        System.out.print(f1+", ");
        System.out.print(f2);
        for(int a = 1; a < n; a++) {
            fn = f2 + f1;
            System.out.print(" , "+fn);
            f1 = f2;
            f2 = fn;
        }
        System.out.println("");
    }
}
       
        
