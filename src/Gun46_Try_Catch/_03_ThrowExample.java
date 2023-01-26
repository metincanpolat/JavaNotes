package Gun46_Try_Catch;

import java.util.Scanner;

public class _03_ThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("yeni şifre oluşturma");


        System.out.println("yeni şifrenizi oluşturunuz= ");
        String password= oku.nextLine();

        try {
            if (password.length()<8)
        {
            throw new Exception("şifre 8 karakterden küçük olamaz");
            // bu mesaj ile hata oluşur
        }
            if (password.length()>15)
        {
            throw new Exception("şifre 15 karakterden büyük olamaz");
        }
        }
        catch (Exception ex)
        {
            // hatalar bir yere toplanıp, hepsi için yapılması gereken işlemler
            // birarada burada yapılabilir. mesela log tutma gibi
            System.out.println("Lütfen dikkat");
            System.out.println("Uyarı = "+ ex.getMessage()); // uyarının yanına yukarıdan gelen hata mesajını yazacak
            // log tutma işlemi
        }
        //log tutmak; programın notlarını tutmak , mesela kimler yanlış şifre girdi, kaç kere girdi... gibi.



    }
}
