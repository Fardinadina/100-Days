
package kompresiStringKeInteger;
import java.math.BigInteger;//untuk pemanggilan type datanya 
public class kompresiStringKeInteger {
    public static void main(String[] args) {
        BigInteger hasil,hasi,has,ha,angka,angka1;
        angka = new BigInteger("1850000000");
        angka1 = new BigInteger("298000000");
        hasil = angka.add(angka1);//penjumlahan
        hasi = angka.subtract(angka1);//pengurangan
        has = angka.multiply(angka1);//perkalian
        ha = angka.divide(angka1);//pembagian
        System.out.println(hasil+"\n"+hasi+"\n"+has+"\n"+ha);  
        
        /*
        add ( sama dengan + )
        substract ( sama dengan - )
        multiply ( sama dengan * )
        divide ( sama dengan / )
        */
        }
    }
