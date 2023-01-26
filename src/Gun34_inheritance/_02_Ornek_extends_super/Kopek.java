package Gun34_inheritance._02_Ornek_extends_super;

public class Kopek extends Hayvan{
    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi); // super miras alınan class base, parent
    }

    @Override
    public void konustu() {
        //super.konustu();
        System.out.println("havladı");
    }
}
