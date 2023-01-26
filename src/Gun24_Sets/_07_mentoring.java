package Gun24_Sets;

import java.util.HashSet;
import java.util.Iterator;

public class _07_mentoring {
    public static void main(String[] args) {
        HashSet h=new HashSet();

        h.add("12");
        h.add(10);
        h.add(10.6);
        h.add(true);
        h.add(null);

        System.out.println("h = " + h);

        h.remove(10); //10 u sildi.
        System.out.println(h.contains(12)); // olup olmadığını boolean olarak verecek.
                                            // biz string atadığımız için false verecek
        System.out.println(h.size()); // uzunluğunu verecek

        Iterator itr=h.iterator(); // iterator nesnesi oluşturma

        while (itr.hasNext()) // sonrası var mı?
            System.out.println(itr.next());



    }
}