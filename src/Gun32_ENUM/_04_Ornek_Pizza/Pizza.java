package Gun32_ENUM._04_Ornek_Pizza;

public class Pizza {
    Size size;
    Kindo kind;

}

enum Size {
    SMALL(1), MEDIUM(2), LARGE(3);
    final int num;

    Size(int num) {
        this.num = num;
    }
}

enum Kindo {
    Margarita(1), Pepperoni(2), Vejeteryan(3), Peynirli(4);
    final int num;

    Kindo (int num) {
        this.num = num;
    }

}
