package Gun05_Scanner;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan adını ve soyadını alarak ekrana yazdırınız.

        Scanner okuyucu=new Scanner(System.in); //okuma işlemini yapacak olan değişken tanımlandı.
        System.out.print("Adınızı ve Soyadınızı giriniz="); // ekrana neyin girileceğini yazdık bilgilendirme
        // System.out.println(); buradaki ln kısmını alt satıra geçmesin diye sildik.
        String adSoyad= okuyucu.nextLine(); // okuma işlemi bu noktada yapılıyor.
        System.out.println(adSoyad);
        // tekrar ekrana yazarak kontrol ettim.


    }
}
