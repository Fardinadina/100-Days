package hargabarangcwo14;
import java.util.Scanner;
public class HargaBarangCwo14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double harga = 0,pilihan,unit;
        String Barang = null;
        System.out.println("Harga barang cowo");
        System.out.println("===================");
        System.out.println("1. peci\n2. baju kokoh\n3. jam tangan\n4. sajadah");
        System.out.print("Pilihan : ");
        pilihan = input.nextDouble();
        System.out.print("Masukkan Jumlah unit/barang : ");
        unit = input.nextDouble();
        
        if (pilihan == 1){
            Barang = "peci";
            harga = 20000*unit;
        }else if (pilihan == 2){
            Barang = "baju kokoh";
            harga = 120000*unit;
        }else if (pilihan == 3){
            Barang = "jam tangan";
            harga = 50000*unit;
        }else if (pilihan == 4){
            Barang = "sajadah";
            harga = 250000*unit;
            
            
        }
        System.out.println("Barang yang anda pilih : " + Barang);
        System.out.println("Total harga : Rp. "+ harga);
       

    }
    
}
