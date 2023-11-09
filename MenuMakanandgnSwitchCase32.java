package liriktanparasabersalah24;

import java.util.Scanner;

public class MenuMakanandgnSwitchCase32 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
    int pilih,harga,porsi,total;
        System.out.println("menu makanan\n1.bakso\n2.nasi goreng");
        System.out.print("pilih : ");
        pilih = masuk.nextInt();
        System.out.print("porsi : ");
        porsi = masuk.nextInt();
        harga = 5000;
        String nama = "Warung nadin";
        System.out.println("============================");
        System.out.println("========"+nama+"========");
        System.out.println("============================");
        switch (pilih){
            case 1:
                System.out.println("bakso ( 5k / porsi )");
                if (porsi >1 ){
                    System.out.println("dapat diskon 2%");
                    total = 2*(harga * porsi)/100;
                    total = (harga * porsi)-total;
                    System.out.println("============================");
                    System.out.println("====total harga : "+total+"=====");
                    System.out.println("============================");
                }
                break;
                case 2:
                System.out.println("nasi goreng ( 13k / porsi )");
                if (porsi >1 ){
                    harga = 10000;
                    System.out.println("dapat diskon 3%");
                    total = 3*(harga * porsi)/100;
                    total = (harga * porsi)-total;
                    System.out.println("============================");
                    System.out.println("====total harga : "+total+"=====");
                    System.out.println("============================");
                }
                break;

            default:
                System.out.println("pilihan tidak tersedia");
                break;
            }
        }
}
    
    
