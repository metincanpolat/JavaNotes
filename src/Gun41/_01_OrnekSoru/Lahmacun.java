package Gun41._01_OrnekSoru;

public class Lahmacun implements IFood{




    @Override
    public void taste() {
        System.out.println("Mükemmel yerli pizza");
    }

    @Override
    public double price() {
        return 30;
    }
    void dough(){
        System.out.println("Mayalı hamur hazırlandı");
    }

    void addMeat(){
        System.out.println("Özel kıyma eklendi");
    }

    void bake(){
        System.out.println("ince çıtır pişirildi");
    }
}
