package Gun24_Sets;

import java.util.HashSet;

public class _04_HashSetMethods {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);

        System.out.println("hs = " + hs);
        System.out.println("hs.size() = " + hs.size());

        hs.remove(5); // elemanın kendisinin değeri verilir ve öyle silinir. String için "" çerisine yazılarak.
        System.out.println("remove sonrası hs = " + hs);

        if (hs.contains(34)) //boolean
            System.out.println("34 var");
        else
            System.out.println("34 yok");

        hs.clear(); // tüm elemanları siler
        System.out.println("hs = " + hs);







    }


}
