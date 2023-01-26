package Gun46_Try_Catch;

import java.util.Scanner;

public class _02_ThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("yeni şifre oluşturma");


        System.out.println("yeni şifrenizi oluşturunuz= ");
        String password= oku.nextLine();

        if (password.length()<8)
        {
            System.out.println("Lütfen dikkat!");
            System.out.println("şifre 8 karakterden küçük olamaz");
            // log tutma işlemi
        }
        if (password.length()>15)
        {
            System.out.println("Lütfen dikkat!");
            System.out.println("şifre 15 karakterden büyük olamaz");
            //log tutma işlemi
        }





    }
}
