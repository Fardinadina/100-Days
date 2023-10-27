
package BelajarLoginWifi;

import java.util.Scanner;

public class BelajarLoginWifi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String username,password;
        System.out.println("Username : ");
        username = input.next();
        System.out.println("Password : ");
        password = input.next();
        
        if(username.equals("Selfndin") && password.equals("frs")){
            System.out.println("Login Berhasil ");
        }else{
            System.out.println(" Login gagal :)");
        }
        
        
        
     
    }
}
