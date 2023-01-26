package Gun41._01_OrnekSoru;


import Utility.MyFunc;

public class TechnoKitchen {

    public static void prepare(IFood f) {
        MyFunc.Wait(1);
        if (f instanceof AdanaKebap) {

                ((AdanaKebap) f).marinade();
                MyFunc.Wait(1);
                ((AdanaKebap) f).grill();
                MyFunc.Wait(1);
                f.taste();


            }
        else
        if (f instanceof Lahmacun) {
            MyFunc.Wait(1);
            ((Lahmacun) f).dough();
            MyFunc.Wait(1);
            ((Lahmacun) f).addMeat();
            MyFunc.Wait(1);
            ((Lahmacun) f).bake();
            MyFunc.Wait(1);
            f.taste();

        } else
            if (f instanceof Borch) {
                MyFunc.Wait(1);
                ((Borch) f).boil();
                MyFunc.Wait(1);
                ((Borch) f).eatTomarrow();
                MyFunc.Wait(1);
                f.taste();
        } else
            if (f instanceof Palov) {
                MyFunc.Wait(1);
                ((Palov) f).boil();
                MyFunc.Wait(1);
                ((Palov) f).fry();
                MyFunc.Wait(1);
                f.taste();

            }

    }



}
