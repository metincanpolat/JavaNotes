package Gun14_forLoop;

public class _08_forLoopASCII {
    public static void main(String[] args) {
        // Günün sorusu : // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
        //A -> 65 , b->66   ->  karakter tablosu -> ascii tablosu
        // 65 sayı olarak yazdırırsam 65, karaktere çevirirsem (char)65 tablodaki karakter larşılığı
       for (int i=0; i<=255 ; i++)
          System.out.println("Sayı="+i+"-"+"Harf karşılığı= "+ (char)i);


    //    for (char i=0; i<=255 ; i++)
//            System.out.println("Sayı="+(int)i+"-"+"Harf karşılığı= "+ i);
// 109 101 116 105 110  - >  metin
    }
}
