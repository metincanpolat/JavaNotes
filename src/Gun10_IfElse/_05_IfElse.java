package Gun10_IfElse;

import java.util.Scanner;

public class _05_IfElse {
    // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
    // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
    // hayır yazdırınız.
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String kelime= oku.nextLine();

        if (kelime.length()>10 && kelime.contains("study")){
            System.out.println("EVET");}
        else System.out.println("HAYIR");

       // if (kelime.length()>10 && kelime.toLowerCase().contains("study")){
        // büyük küçük harf duyarlı yapmak için önce küçüğe çevirip sonra soruyoruz




    }
}
