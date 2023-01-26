package Gun41._01_OrnekSoru;

public class Borch implements IFood{
    @Override
    public void taste() {
        System.out.println("Scak sebze çorbası");
    }

    @Override
    public double price() {
        return 20;
    }
    void boil(){
        System.out.println("kısık ateşte kaynatılıyor");
    }
    void eatTomarrow(){
        System.out.println("Bir gün sonra servis edilir");
    }


}
