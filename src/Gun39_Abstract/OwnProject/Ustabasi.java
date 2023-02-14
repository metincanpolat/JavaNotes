package Gun39_Abstract.OwnProject;

public class Ustabasi extends Isci{

    @Override
    protected int saatUcreti() { // burada işçi class ını extend yaptık. Bu sayede abstract class lardaki metodları implement etmek zorunda kalmadık.
                                 // Usta başı da aslında bir işçi ama maaşı farklı olacağı için o class ın metodlarını override yaptık.
        return 15;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
