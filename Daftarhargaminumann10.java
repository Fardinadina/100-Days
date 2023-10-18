
package daftarhargaminumann10;
import java.util.Scanner;
public class Daftarhargaminumann10 {
    public static void main(String[] args) {
      
Scanner input = new Scanner(System.in);
        double harga =0,porsi,pilihan =0,harga1=0;
        String menu;
        System.out.println("=======Warung Fardina=======");
        System.out.println("=======Daftar Minuman=======");
        System.out.println("1. Sara'ba\n2. Jahe\n3. Air putih\n4. Jamu\n");
        System.out.print("pilihan: ");
        pilihan = input.nextDouble();
        
        System.out.print("Masukkan Jumlah Porsi : ");
        porsi = input.nextDouble();
        
        if (pilihan == 1){
            menu = "Sara'ba";
            harga = 5000;
            harga1 = harga*porsi;
        }else if (pilihan == 2){
            menu = "Jahe";
            harga =6000;
            harga1 = harga*porsi;
        }else if (pilihan == 3){
            menu = "Air putih";
            harga = 1000;
            harga1 = harga*porsi;
        }else if (pilihan == 4){
            menu = "Jamu";
            harga = 4000;
            harga1 = harga*porsi;    
        }
        
        System.out.println("Total harga: Rp " + harga1);






    }
    
}
