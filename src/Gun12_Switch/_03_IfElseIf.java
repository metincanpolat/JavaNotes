package Gun12_Switch;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("Ders ve Notunu giriniz: "); // Fizik: 77 Kimya90
        String dersN= oku.nextLine(); // Fizik: 45

        int not=Integer.parseInt(dersN.replaceAll("[^0-9]","")); // 0-9 dışındakileri siler. Değiştirip int e çevirdik
        String dersAdi=dersN.replaceAll("[0-9]",""); //sadece sayıkları boşalt

        System.out.println("not = " + not);
        System.out.println("dersAdi = " + dersAdi);

        if (not >=90)
            System.out.println("A");
        else if (not>=80) System.out.println("B");
        else if (not>=70) System.out.println("C");
        else if (not>=60) System.out.println("D");
        else if (not>=40) System.out.println("E");
        else System.out.println("F");


    }
}
