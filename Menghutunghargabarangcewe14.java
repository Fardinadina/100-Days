package  HargaBarangCwe13;
import java.util.Scanner;
public class HargaBarangCwe13 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double harga = 0,pilihan,unit;
        String Barang = null;
        System.out.println("Harga barang cewe");
        System.out.println("===================");
        System.out.println("1. mukenah\n2. dompet\n3. cermin\n4. jilbab");
        System.out.print("Pilihan : ");
        pilihan = input.nextDouble();
        System.out.print("Masukkan Jumlah unit/barang : ");
        unit = input.nextDouble();
        
        if (pilihan == 1){
            Barang = "mukenah";
            harga = 100000*unit;
        }else if (pilihan == 2){
            Barang = "dompet";
            harga = 25000*unit;
        }else if (pilihan == 3){
            Barang = "cermin";
            harga = 5000*unit;
        }else if (pilihan == 4){
            Barang = "jilbab";
            harga = 15000*unit;
            
            
  }
        System.out.println("Barang yang anda pilih : " + Barang);
        System.out.println("Total harga : Rp. "+ harga);
       

  }
    
}
