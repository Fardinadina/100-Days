package menghitungpersegipanjang08;
import java.util.Scanner;
public class MenghitungPersegiPanjang08 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int panjang,lebar;
        System.out.print("Masukkan panjang : ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar = input.nextInt();
        int luas = panjang*lebar;
        int keliling = panjang + lebar + panjang + lebar;
        System.out.println("luas: " + luas);
        System.out.println("keliling: "+ keliling);
       
       
        
        
        
        
    }
    
}
