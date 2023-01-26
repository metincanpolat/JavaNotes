package Gun35._01_Ornek_inheritance;

public class Otobus extends Arac{
    private int yolcuKapasitesi;


    public Otobus(String marka, String renk, int motorHacmi,int yolcuKapasitesi) {
        super(marka, renk, motorHacmi);
        setYolcuKapasitesi(yolcuKapasitesi);
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return "Otobus{" +"marka='" + getMarka() + '\'' +
                ", renk='" + getRenk() + '\'' +
                ", motorHacmi=" + getMotorHacmi() +"cc"+
                " yolcuKapasitesi=" + yolcuKapasitesi +
                '}';
    }
}
