package Gun35._01_Ornek_inheritance;

public class Arac {
    private String marka;
    private String renk;
    private int motorHacmi;

    public Arac(String marka, String renk, int motorHacmi) {
        setMarka(marka);
        setRenk(renk);
        setMotorHacmi(motorHacmi);

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "marka='" + marka + '\'' +
                ", renk='" + renk + '\'' +
                ", motorHacmi=" + motorHacmi +
                '}';
    }
}
