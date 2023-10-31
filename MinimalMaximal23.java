package minimalmaximal23;
import java.util.Scanner;
public class MinimalMaximal23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min =100,max=0,angka=0,jml;
        System.out.print("Jumlah Angka : ");
        jml =input.nextInt();
        System.out.println("--------------------");
        for(int a=1; a<= jml; a++){
            System.out.print("Angka ke- "+a+" = ");
            angka = input.nextInt();
            if (angka > max){
                max = angka;
        
        }if (angka < min){
            min = angka;
        }            
        }
        System.out.println("Nilai Minimal : "+min);
        System.out.println("Nilai Maximal : "+max);


    }
    
}
