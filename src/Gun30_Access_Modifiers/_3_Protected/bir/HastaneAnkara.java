package Gun30_Access_Modifiers._3_Protected.bir;

public class HastaneAnkara {
    public static void main(String[] args) {

        Doktor dr=new Doktor();
        dr.adi="ismet";
        dr.bolumu="Dahiliye";
        dr.hastaneAdi="Ankara Hastanesi";

        dr.noAta("23654"); //private e eriştik.
        dr.noyazdir();









    }
}
