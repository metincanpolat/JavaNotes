package Gun26_Classes.SonradanNot._01;

class insan{
    int boy;
}

class ogrenci extends insan implements Cloneable{
    Object kopyala() throws CloneNotSupportedException{
        return this.clone();
    }
    ogrenci kopyala2(){
        ogrenci temp = new ogrenci();
        temp.boy = this.boy;
        return temp;
    }

}
public class _Classlari_Tani {
    public static void main(String[] args) throws CloneNotSupportedException{
        // Bir package ın içerisinde sadece 1 tane public class olabilir, o da dosya ismi ile aynı olmak zorunda.
        // Eğer başka class lar aynı sayfada tanımlamak istiyorsak public olamaz, public yapacaksak farklı pencerede açmak zorundayız.

        insan ali=new insan();
        insan ahmet=ali; // shallow copy (sığ kopyalama)
        ali.boy = 180;
        System.out.println(ahmet.boy);
        if (ali==ahmet){
            System.out.println("eşitler");
        }
        if (ali.equals(ahmet))
            System.out.println("eşitler 2");
        ogrenci ayse=new ogrenci();
        ayse.boy=160;
        ogrenci fatma=(ogrenci) ayse.kopyala(); //Deep copy (derin kopyalama) veya kopyala 2 yi kullan aynı
        System.out.println("ayse = " + ayse.boy);
        System.out.println("fatma.boy = " + fatma.boy);
        fatma.boy=190;
        System.out.println("ayse = " + ayse.boy);
        System.out.println("fatma.boy = " + fatma.boy);

        // https://www.youtube.com/watch?v=p7RbWlTnvRg&list=PLh9ECzBB8tJPFTpuHKhYayis0H9pS6_rI&index=8



    }
}
