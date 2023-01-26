package Gun30_Access_Modifiers._3_Protected.iki;

import Gun30_Access_Modifiers._3_Protected.bir.Doktor;

public class HastaneIstanbul {
    public static void main(String[] args) {
        Doktor dr=new Doktor("Mehmet");
        //Doktor dr1=new Doktor(); default sadece
        // kendi paketi ulaşır. Constructorları incele.
        dr.hastaneAdi="Istanbul"; // sadece public olduğu için hastane adına ulaşabildik.

        // ama contructor kullanarak protected olan doktor adına da buradan
        // ulaşabiliyoruz.




    }
}
