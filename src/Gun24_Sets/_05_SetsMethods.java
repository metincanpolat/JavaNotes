package Gun24_Sets;

import java.util.HashSet;

public class _05_SetsMethods {
    public static void main(String[] args) {
        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);
        System.out.println("setA = " + setA);

        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        System.out.println("setB = " + setB);

        /*** birleştirme ***/
        HashSet<Integer> birlesikHali=new HashSet<>();
        birlesikHali.addAll(setA); // toplu ekleme
        birlesikHali.addAll(setB);
        System.out.println("birlesikHali = " + birlesikHali);

        /*** farkı ***/
        HashSet<Integer> farki=new HashSet<>();
        farki.addAll(setA);
        farki.removeAll(setB); // önce setA yı ekledik sonra setB yi çıkardık.Sadece setA ya özgü elamanlar kaldı.
        System.out.println("farki = " + farki); // A/B veya A-B (A fark B)

        /*** ortak elemanlar, kesişim ***/
        HashSet<Integer> ortakElemanlar=new HashSet<>();
        ortakElemanlar.addAll(setA);
        ortakElemanlar.retainAll(setB); // önce setA yı ekledik sonra setB ile ortak elamanları bulduk.
        System.out.println("ortakElemanlar = " + ortakElemanlar);//A ∩ B (A kesişim B)




    }
}
