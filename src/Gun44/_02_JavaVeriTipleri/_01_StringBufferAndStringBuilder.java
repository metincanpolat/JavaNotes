package Gun44._02_JavaVeriTipleri;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {

        String cumle = "";

        cumle = cumle + "Bugün ";
        cumle = cumle + "hava ";
        cumle += "soğuk";

        System.out.println("cumle = " + cumle);
        System.out.println("cumle.concat(\" dün daha sıcaktı\") = " + cumle.concat(" dün daha sıcaktı.")); // burada atama yok. komut sadece bu satır için geçerli.
        System.out.println("cumle = " + cumle);

        cumle = cumle.concat(" dün daha sıcaktı."); // cümlede burada artık atama yapıldı ve cümle değişti.
        System.out.println("cumle = " + cumle);

        /**** StringBuilder ****/
        StringBuilder cumle2=new StringBuilder();
        cumle2.append("Bugün "); // append : atama gerektirmez, ekler
        cumle2.append("hava ");
        cumle2.append("güzel ");

        System.out.println("cumle2 = " + cumle2);
        
        //********** String ekleme işlemlerinde performans testi ******/
        // 1.Yöntem

        long startTime = System.currentTimeMillis();
        
        String test1="";
        for (int i = 0; i < 10000; i++) { //618 ms
            test1 = test1+ "merhaba";
        }
        System.out.println("+ için süre = " + (System.currentTimeMillis()-startTime)+" ms");

        // 2. Yöntem concat ile ekleme
        startTime = System.currentTimeMillis();

        String test2="";
        for (int i = 0; i < 10000; i++) { // 554 ms
            test2 = test2+ "merhaba";
        }
        System.out.println("concat için süre = " + (System.currentTimeMillis()-startTime)+" ms");

        // 3.Yöntem StringBuilder ile ekleme
        startTime = System.currentTimeMillis();

        StringBuilder test3=new StringBuilder(); // 0 ms
        for (int i = 0; i < 10000; i++) {
            test3.append("merhaba");
        }
        System.out.println("StringBuilder için süre = " + (System.currentTimeMillis()-startTime)+" ms");

        // 4.Yöntem StringBuffer ile ekleme
        startTime = System.currentTimeMillis();

        StringBuffer test4=new StringBuffer(); // 0 ms
        for (int i = 0; i < 10000; i++) {
            test4.append("merhaba");
        }
        System.out.println("StringBuffer için süre = " + (System.currentTimeMillis()-startTime)+" ms");

        // Performans testi sonucu :
        // eğer 3 e kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        /******* StringBuilder ı biraz inceleyelim ****/
        StringBuilder s=new StringBuilder();

        s.append("Bugün ");
        s.append("hava ");
        s.append("güzel ");
        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());
        s.append(4); // eklenen her şeyi toString hali varsa çevirerek ekler
        System.out.println("s = " + s);

        s.reverse(); // stringi tersine çevirir.
        System.out.println("s = " + s);
        s.reverse();
        System.out.println("s = " + s);

        s.delete(0,5); // 0 dahil 5 hariç indexe göre siler.
        System.out.println("delete = " + s);

        s.deleteCharAt(3); // sadece belirtilen indexteki karakteri siler
        System.out.println("deleteCharAt = " + s);

        s.insert(5,"kelime"); // 5 nolu indexe araya kelime eklendi.5 deki yana kaydı.
        System.out.println("insert = " + s);

        s=new StringBuilder("Bugun hava sıcak"); // sıfırlandı tekrar değer atandı
        System.out.println("s = " + s);

        s.replace(3,8,"bu"); // verilen aralığı verilenle değiştiriyor.3 dahil 8 hariç.
        System.out.println("replace = " + s);

        String str=s.toString(); //stringe çevirdik

        StringBuffer sbuffer=new StringBuffer(); //StringBuilder ile aynı çalışıyor.
        // ilk Buffer vardı sonra daha hızlısı builder çıkarıldı.
        // tek farkı, paralel çalışan yazılımlarda, StringBuffer kullanılır.

        // StringBuilder sınıfının bir diğer avantajı ise, String sınıfına göre daha hızlı çalışmasıdır.
        // Çünkü String sınıfı her değiştirme işlemi sonrası yeni bir nesne oluştururken, StringBuilder nesnenin içerisindeki dizgi değiştirilir.
        //
        //Ayrıca StringBuilder thread safe olmadığından aynı anda birden fazla thread tarafından kullanılması durumunda problemlere neden olabilir.
        // Bu durumda StringBuffer sınıfını tercih edebilirsiniz.




    }
}
