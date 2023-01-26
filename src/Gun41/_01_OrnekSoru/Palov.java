package Gun41._01_OrnekSoru;

public class Palov implements IFood{
    @Override
    public void taste() {
        System.out.println("Çocukların vazgeçilmezi");
    }

    @Override
    public double price() {
        return 20;
    }
    void fry(){
        System.out.println("pirinç ve şehriye kavruldu.");
    }
    void boil(){
        System.out.println("kısık ateşte pişirildi.");
    }
}
