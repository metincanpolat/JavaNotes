package Gun21_Return;

public class _09_Return {
    public static void main(String[] args) {
        int s1 = 45;
        int s2 = 4;
        int s3 = 67;
        int s4 = 23;

        int sonuc1=toplam(s1,s2);
        int sonuc2=toplam(s1,s2,s3);
        int sonuc3=toplam(s1,s2,s3,s4);
        // parametreler aynı tip sadece miktarları farklı
        // bu tip durumlar için bir kolaylık sağlamış.

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);

        int carpimSon=carpim(s1,s2,s3);
        System.out.println("carpimSon = " + carpimSon);


    }
    // gelen kaç sayı olursa olsun hepsini al dizi şeklinde metoda al

    public static int toplam(int... sayilar) // kaç sayı gelirse gelsin onları dizi şeklinde alıyor
    {
        int toplam=0;

        for (int i = 0; i < sayilar.length; i++)
            toplam=toplam+sayilar[i];

        return toplam;
    }
    public static int carpim(int...sayilar)
    {
        int carpim=1;
        for (int j = 0; j < sayilar.length ; j++)
            carpim=carpim*sayilar[j];
        return carpim;
    }
  //  public static int toplam(int s1,int s2){
   //     return s1+s2;
  //  }
  //  public static int toplam(int s1,int s2,int s3){
  //      return s1+s2+s3;
  //  }
   // public static int toplam(int s1,int s2,int s3,int s4){
   //     return s1+s2+s3+s4;
   // }



}
