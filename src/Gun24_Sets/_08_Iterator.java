package Gun24_Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class _08_Iterator {
    public static void main(String[] args) {
        // Java dilinde Iterator bir interface'dir ve Collection ve List gibi sınıflar için kullanılır. Bu interface ile bir veri yapısının içerisindeki elemanları gezinebilir ve her bir elemanı tek tek erişebilirsiniz. Iterator ile döngü kullanarak, bir Collection veya List içerisindeki elemanları daha etkili bir şekilde yönetebilirsiniz.
        //
        //Iterator interface'i 3 temel metod içerir:
        //
        //hasNext(): Bu metod, veri yapısının içerisinde dolaşmakta olduğunuz pozisyondan sonraki bir elemanın var olup olmadığını kontrol eder.
        // Eğer var ise true, yoksa false döndürür.
        //next(): Bu metod, veri yapısının içerisinde dolaşmakta olduğunuz pozisyondan sonraki elemanı döndürür.
        // Eğer veri yapısının içerisinde daha eleman yoksa NoSuchElementException fırlatır.
        //remove() : Bu metod, veri yapısının içerisinde dolaşmakta olduğunuz pozisyondaki elemanı siler.
        //Iterator ile döngü kullanarak bir veri yapısının içerisindeki elemanları gezmek için aşağıdaki kod yapısı kullanılabilir:

//        Iterator<T> itr = collection.iterator();
//        while (itr.hasNext()) {
//            T element = itr.next();
//            //do something with the element
//        }

        //Bu kod bloğunda, collection veri yapısının içerisindeki elemanları gezmek için bir Iterator nesnesi oluşturulur.
        // Döngü içerisinde, her seferinde itr.hasNext() metodu ile bir sonraki elemanın var olup olmadığı kontrol edilir.
        // Eğer var ise, itr.next() metodu ile sonraki eleman elde edilir ve bu eleman üzerinde istediğiniz işlemler gerçekleştirilir.
        // Bu süreç collection içerisindeki tüm elemanlar için tekrar eder ve döngü sonlandırılır.
        //
        //Ayrıca, Iterator ile silme işlemleri de yapabilirsiniz. Örnek olarak;

//        Iterator<T> itr = collection.iterator();
//        while (itr.hasNext()) {
//            T element = itr.next();
//            if (condition) {
//                itr.remove();
//            }
//        }

        // Bu kod bloğunda, condition gerçekleştiğinde, itr.remove() ile veri yapısındaki ilgili eleman silinir.
        //
        //Iterator ile döngü kullanarak, veri yapısının içerisindeki elemanları tek tek erişebilir ve istediğiniz işlemleri gerçekleştirebilirsiniz.
        // Bu yapı, veri yapısının içerisinde değişiklik yaparken daha güvenli ve kontrollü bir şekilde çalışmanıza olanak tanır.

// Evet, Java'da bir HashSet içerisindeki elemanların bir String içerisinde kaçar tane olduğunu kontrol etmek için Iterator kullanabilirsiniz.
// Iterator ile HashSet içerisindeki tüm elemanları gezinerek, String içerisinde varlığını kontrol edebilirsiniz. Örnek olarak;

        HashSet<String> fruits = new HashSet<>(Arrays.asList("apple", "banana", "orange", "mango"));
        String str = "apple,banana,orange,mango,apple,banana";

        int count = 0;
        Iterator<String> itr = fruits.iterator();
        while(itr.hasNext()){
            String fruit = itr.next();
            if(str.contains(fruit)) count++;
        }
        System.out.println("The number of elements in the HashSet that are in the String: " + count);

        // Bu örnekte Iterator kullanarak fruits seti içerisinde gezinerek her bir elemanın str içerisinde varlığı kontrol edilir ve eşleşen elemanlar için sayaç arttırılır.
        // Sonunda ekrana "The number of elements in the HashSet that are in the String: 4" yazdırılacaktır.
        //
        //Bu yöntemle de HashSet içerisindeki elemanların bir String içerisinde kaçar tane olduğunu kontrol edebilirsiniz.

    }
}
