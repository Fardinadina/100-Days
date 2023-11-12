package loopingdowhile35;
import java.util.Scanner;
public class Loopingdowhile35 {
        public static void main(String[] args) {
           Scanner masuk = new Scanner(System.in);
           int awal, akhir;
            System.out.print("awal : ");
            awal = masuk.nextInt();
            System.out.print("akhir : ");
            akhir = masuk.nextInt();
            int a = awal;
            do{
                System.out.print(a+" ");
                a++;
            } while(a <= akhir);
            System.out.println("");
                     
       }
    
}
