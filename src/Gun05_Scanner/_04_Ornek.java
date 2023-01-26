package Gun05_Scanner;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Adı=");
        String Adi= oku.next();
        System.out.print("Soyadı=");
        String Soyadi= oku.next();
        System.out.println("Adı Soyadı:"+Adi+" "+Soyadi);

    }

}
