package Gun04_Donusumler;

public class _07_Ornek4 {
    public static void main(String[] args) {
        // String olarak verilen 2 adet bağış parasının toplamını yazınız.

        String bagis1="50";
        String bagis2="100";
        // int toplamBagis=bagis1+bagis2; string oldukları için toplamaz

        System.out.println(bagis1+bagis2);  // yan yana yazar 2 ayri kelime gibi düşündü

        int intBagis1= Integer.parseInt(bagis1);
        int intBagis2= Integer.parseInt(bagis2);

        int toplamBagis= intBagis1 + intBagis2;
        //  int toplamBagis= Integer.parseInt(bagis1) + Integer.parseInt(bagis2); seklinde de yazilabilir.

        System.out.println("toplamBagis = " + toplamBagis);


    }
}
