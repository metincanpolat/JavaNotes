package Gun14_forLoop;

import java.util.Scanner;

public class _10_ContiuneOrn {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.
        // cumle.length -> string uzunluğunu verir
        // cumle.charAt(5) ->                 VIDEODAN YAZ
        Scanner oku=new Scanner(System.in);
        System.out.println("Cumle yazınız");
        String cumle= oku.nextLine();

        for (int i=0 ; i<cumle.length() ; i++){
            if (cumle.charAt(i)==' ') continue;

            System.out.println(cumle.charAt(i));
        }





    }
}
