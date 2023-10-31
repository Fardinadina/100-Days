package HargaKebutuhanRumah;
import java.util.Scanner;
public class HargaKebutuhanRumah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double harga = 0,pilihan,unit;
        String Barang = null;
        System.out.println("HargaKebutuhanRumah");
        System.out.println("===================");
        System.out.println("1. kursi\n2. lemari\n3. vas bunga");
        System.out.print("Pilihan : ");
        pilihan = input.nextDouble();
        System.out.print("Masukkan Jumlah unit/barang : ");
        unit = input.nextDouble();
        
        if (pilihan == 1){
            Barang = "kursi";
            harga = 35000*unit;
        }else if (pilihan == 2){
            Barang = "lemari";
            harga = 65000*unit;
        }else if (pilihan == 3){
            Barang = "vas bunga";
            harga = 20000*unit;
            
        }
        System.out.println("Barang yang anda pilih : " + Barang);
        System.out.println("Total harga : Rp. "+ harga);
    }
    
}
