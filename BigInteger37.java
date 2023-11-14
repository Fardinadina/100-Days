package biginteger37;
import java.math.BigInteger37;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukla angka : ");
        String i = input.nextLine();
        BigInteger a = new BigInteger(i);
        
        System.out.print("angka2 : ");
        String b = input.nextLine();
        BigInteger c = new BigInteger(b);
        
        BigInteger d = a.add(c);
        
        System.out.println(d);
        
        
    }
    
}
