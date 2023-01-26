package OCA_Sorular._02_Quizlerden._01_thisClass;

public class soru6 {
    public soru6 ()
    {
        System.out.println("Default constructor");
    }
    public soru6(int i)
    {
        this();
        System.out.println("Single parameter constructor: " + i);
    }
    public soru6(int i, int j)
    {
        this(j);
        System.out.println("Double parameter constructor: " + i + ", " + j);
    }

    // Bu soruda this() class ı temsil ediyor. Parametre durumuna göre ilgili constructor a gidiyor.
    // mainden işaret eden iki değişkenli parametre. O çalışınca sırayla diğerlerini
    // ziyaret ediyor. Quiz 8 S7

}
