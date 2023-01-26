package Gun05_Scanner;

import java.util.Scanner;

public class _08_Ornek {
    public static void main(String[] args) {
       // Kullanıcıdan ağırlıını double, boyunnu int olarak alınız.
        // ve bir satırda boyunuz... ve kilonuz ... şeklinde yazınız.
        // vki de bularak yazdırınız (kg/boy*boy)

        Scanner oku=new Scanner(System.in);

        System.out.print("Ağırlık(kg)= ");
        double agirlik= oku.nextDouble();
        System.out.print("Boy(cm)= ");
        int boy= oku.nextInt();
        double vki=agirlik/(boy*boy);

        System.out.println("Boyunuz="+boy+", Kilonuz="+agirlik);
        System.out.println("Vucut Kitle Indexi = " + vki);





    }

}
