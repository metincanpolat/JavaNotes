package Gun41._01_OrnekSoru;

public class AdanaKebap implements IFood{
    @Override
    public void taste() {
        System.out.println("etin en güzel hallerinden biri");
    }

    @Override
    public double price() {
        return 50;}


    void marinade (){
            System.out.println("Et 1 gün öncesinde özel baharatlar ile marine edildi");
        }

    void grill(){
        System.out.println("Kömür ateşinde yavaş pişirildi");
        }
    }
