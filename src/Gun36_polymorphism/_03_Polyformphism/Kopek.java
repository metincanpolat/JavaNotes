package Gun36_polymorphism._03_Polyformphism;

public class Kopek extends Hayvan{
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("havladı");
    }

    public void kokladi()
    {
        System.out.println("Kokladı");
    }

}
