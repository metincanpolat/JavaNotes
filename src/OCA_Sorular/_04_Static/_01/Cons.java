package OCA_Sorular._04_Static._01;

public class Cons {
    public static int length=0;
}

class Conslength{
    static Cons cons1=new Cons();
    static Cons cons2=new Cons();
    static {
        System.out.print(cons1.length);
    }

    public static void main(String[] args) {

        cons1.length=2;
        cons2.length=8;

        System.out.println(cons1.length);

        /*
        A. 02
        B. 08
        C. 2
        D. 8
        E. Kod çalışmaz
        F. Kod çalışır anck exception oluşur.



        // Bir inner class da run yapıldığı zaman mainden önce eğer bir statik metod varsa o çalışır.

        Çözüm:
        https://www.youtube.com/watch?v=7FszQjOg5pA

         */
    }
}