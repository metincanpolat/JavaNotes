package Gun04_Donusumler;

public class _00_Giris {
    public static void main(String[] args) {
        byte ogrNot=90;

        int notToplam = ogrNot;  //byte turunu int turune atmis olduk widening casting, genisletilme

        ogrNot = (byte)notToplam; // int turunu byte turune donusturuyorum.
                                    // bunu ancak veri kaybi olusmuyorsa yani DEGER atilacak tipe sığıyorsa yapabilirim
// bunu da bilerek yaptığımı belirtmek için dönüşecek tipin başına, hedef tipin adı parantez içinde yazılır.
        // Daraltma (Narrow) yönünde dönüşüm (Casting) denir.

    }
}
