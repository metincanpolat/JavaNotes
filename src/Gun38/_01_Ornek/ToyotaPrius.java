package Gun38._01_Ornek;

public class ToyotaPrius extends Vehicle implements IElectric, IGas {
    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "gittiği yere kadar";
    }

    @Override
    public String changeOil() {
        return "ömür boyu kullan";
    }

    @Override
    public String drive() {
        return "bir depo ile 300km gider";
    }
}
