package Gun40._01_Ornek;

public class Cat extends Animal {

    public Cat(String name, boolean wild, String birthday) {
        super(name, wild, birthday);
    }

    @Override
    void food() {
        System.out.println("rat and fish");
    }

    @Override
    void amountOfFood() {
        System.out.println("100 gr");
    }

    @Override
    void sleepTime() {
        System.out.println("16 saat");
    }

    @Override
    void voice() {
        System.out.println("miyav");
    }
}
