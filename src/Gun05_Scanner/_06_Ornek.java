package Gun05_Scanner;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // Bir karenin kenarını kullaıcıdan isteyip çevresini ve alanını ekrana yazdırınız.
        // cevre=a+a+a+a   alan=a*a

        Scanner oku=new Scanner(System.in);

        System.out.print("Kenar Uzunluğu:");
        int a= oku.nextInt();

        int cevre=4*a;
        int alan=a*a;
        System.out.println("Çevresi = " + cevre);
        System.out.println("Alanı = " + alan);


    }
}
