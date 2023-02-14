package Gun37_Interface._04_Ornek;

public class A4 implements IGosterir,IYazdirir{ //hem karasal hem uydu
    @Override
    public void goster() {
        System.out.println("gosterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("yazdırdı");

    }


}
