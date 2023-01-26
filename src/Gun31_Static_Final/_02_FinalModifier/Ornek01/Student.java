package Gun31_Static_Final._02_FinalModifier.Ornek01;

public class Student {

    private final int okulNo;
    String tamAd;

    private static int sayac=0;

    public Student(String tamAd)
    {
        this.okulNo=++sayac;
        this.tamAd=tamAd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "okulNo=" + okulNo +
                ", tamAd='" + tamAd + '\'' +
                '}';
    }
}
