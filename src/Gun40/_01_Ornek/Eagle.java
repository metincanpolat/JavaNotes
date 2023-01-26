package Gun40._01_Ornek;

public class Eagle extends Animal {
    public Eagle(String name, boolean wild, String birthday) {
        super(name, wild, birthday);
    }

    @Override
    void food() {
        System.out.println("Et");
    }

    @Override
    void amountOfFood() {
        System.out.println("1 Kg");
    }

    @Override
    void sleepTime() {
        System.out.println("8 Saat");
    }

    @Override
    void voice() {
        System.out.println("Ciyak");
    }
}
