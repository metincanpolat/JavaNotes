package Gun34_inheritance._01_Ornek_inheritance;

public class Yonetici extends Personel{
    private double yoneticiTazminati;

    // 1 dükkan daha ekledin
    public void zamYap(){
        System.out.println("zam yapıldı");
    }

    public double getYoneticiTazminati() {
        return yoneticiTazminati;
    }

    public void setYoneticiTazminati(double yoneticiTazminati) {
        this.yoneticiTazminati = yoneticiTazminati;
    }






}
