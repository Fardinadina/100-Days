package segitiga05;
import java.util.Scanner;
public class Segitiga05 {
        public static void main(String[] args) {
        double L, K, a, t, s;
        Scanner masuk = new Scanner(System.in);
        System.out.print("masukkan a = ");
        a = masuk.nextDouble();
        System.out.print("masukkan t = ");
        t = masuk.nextDouble();
        s = a;
        L = 0.5 * ( a * t);
        K = s + s + s;
        System.out.println( "L = " +L );
        System.out.println("K = " +K);
            
            
            
            
            
            }
    
}
