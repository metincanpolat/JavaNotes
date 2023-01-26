package Gun27._03_Ornek;

public class Sirket {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım :  getBirthYear isminde Person a ait bir metod yazınız,
        //            çalıştığında kişinin doğum yılını versin.
        // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

        Person kisi1=new Person();

        kisi1.name="Metin";
        kisi1.surname="Canpolat";
        kisi1.age=38;

        Person kisi2=new Person();
        kisi2.name="İsmet";
        kisi2.surname="Temur";
        kisi2.age=45;

        //1.yöntem
        System.out.println("kisi1.name = " + kisi1.name);
        System.out.println("kisi1.surname = " + kisi1.surname);
        System.out.println("kisi1 = " + kisi1.age);

        System.out.println("kisi2 = " + kisi2.name);
        System.out.println("kisi2 = " + kisi2.surname);
        System.out.println("kisi2.age = " + kisi2.age);
        System.out.println("****************************");

        //2.yöntem    Burada kendi class ında method oluşturduk
        bilgiYazdir(kisi1);
        bilgiYazdir(kisi2);

        System.out.println("*****************");

        //3.yöntem   ilgili methodu kendi class ına at en iyi yöntem
        kisi1.bilgiYazdir();
        kisi2.bilgiYazdir();

        System.out.println("**************************");

        /*    4.Adım    */
        System.out.println("kisi1 Yaşı= "+kisi1.getBirthYear());
        System.out.println("kisi2 Yaşı= "+kisi2.getBirthYear());

        System.out.println("*******************************");



        /*    5.Adım    */
        System.out.println("kisi1 baş harfler: "+kisi1.getInitials());
        System.out.println("kisi2 baş harfler: "+kisi2.getInitials());







    }
    public static void bilgiYazdir(Person p){
        System.out.println("kisi = " + p.name);
        System.out.println("kisi = " + p.surname);
        System.out.println("kisi = " + p.age);

    }




}
