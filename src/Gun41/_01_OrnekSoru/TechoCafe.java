package Gun41._01_OrnekSoru;

import Gun40._02_Ornek._02.B;

import java.util.ArrayList;
import java.util.Scanner;

public class TechoCafe {
    public static void main(String[] args) {

        ArrayList<IFood> orders=new ArrayList<>();

        System.out.println("TechnoCafe'ye Hoş geldiniz.");
        Scanner readInt=new Scanner(System.in);
        int choise;
        do {
            System.out.println("MENU:\n 1-Adana Kebap\n 2-Lahmacun\n 3-Borch\n 4-Palov\n5-Tamam\nYour choise : ");
            choise=readInt.nextInt();
            switch (choise){
                case 1: IFood ak=new AdanaKebap();
                orders.add(ak);break;
                case 2: Lahmacun l=new Lahmacun();
                orders.add(l);break;
                case 3: Borch b=new Borch();
                orders.add(b);break;
                case 4: Palov p=new Palov();
                orders.add(p);break;
            }

        }while (choise!=5);

        System.out.println("You Orders: ");
        for (IFood f : orders)
        {
            System.out.println(f.getClass().getSimpleName()); // class ın adını alambilmek için.
        }

        double sumPrice=0;
        for (IFood f : orders)
        {
            TechnoKitchen.prepare(f);
            sumPrice+=sumPrice+ f.price();
        }
        System.out.println("sumPrice = " + sumPrice);



    }

}
