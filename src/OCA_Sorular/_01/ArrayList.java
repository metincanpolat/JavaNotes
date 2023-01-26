package OCA_Sorular._01;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        // son sıraya denk gelen indexe eklenebilir,
        // ama ondan daha büyük bir indexe eklenemez hata veririr

        List colors=new java.util.ArrayList();

        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");

        colors.remove(2);  //  red silindi

        System.out.println("colors = " + colors);

        colors.add(3, "cyan");
        // son sıraya denk gelen indexe eklenebilir,
        // ama ondan daha büyük bir indexe eklenemez hata veririr

        System.out.println("colors = " + colors);
    }
}
