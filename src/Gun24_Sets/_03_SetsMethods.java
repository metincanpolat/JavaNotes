package Gun24_Sets;

import java.util.HashSet;
import java.util.Iterator;

public class _03_SetsMethods {
    public static void main(String[] args) {

        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("RED"); // bu eklendi
        renkler.add("Red"); // bu eklenmedi

        // Ekrana yazdırma
        System.out.println("renkler = " + renkler);

        // Ekrana yazdırma tek tek (foreach), dizinin içindeki sırasına göre gelmesi garanti değil.
        for (String eleman : renkler)
        {
            System.out.println("eleman = " + eleman);
        }

        // içindeki sıranın garanti edildiğiyöntem
        Iterator gosterge=renkler.iterator();// Hafızadaki ilk kutucuğun yerini aldım,
        // ben adım adım gideceğim, böylece içindeki sırayı takip edeceğim.

        // adım adım girme, bir sonraki bir sonraki
        while (gosterge.hasNext())
        {
            System.out.println("gosterge = " + gosterge.next());
           // if (böyleyse) gosterge.remove(); // o andaki kutucuğu siler
        }








    }
}
