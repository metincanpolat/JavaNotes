package Gun03_Java_Variable;

public class _02_JavaDataTypes {
    public static void main(String[] args) {
        int sayi;   // butun tam sayilar kendi baslarınayken default INT gorulur.

        byte byteDeger=7;         // -128  127
        short shortDeger=1645;
        int  intDeger=25000;
        long longDeger= 41515155451545L;    // Default olarak tam sayilari INT kabul ettıginden
                                            // sonuna L koyarak LONG oldugunu belirttik.

        //ondalikli sayilar
        // default olarak butun ondalıklı sayiları DOUBLE kabul eder
        float floatdeger=3.145125211252F;   //ondaliklii sayilar default olarak Double gordugunden
                                            //sonuna F ekleyerek FLOAT oldugunu belirttik.

        double doubleDeger=3.14555555662665;

        char basHarf='A';         //sayı olarak sakliyor karakter tabosuna bakarak, mesela A->65
        boolean evetMi=true;      // sadece 2 deger olabilir: true veya false

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("floatdeger = " + floatdeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("evetMi = " + evetMi);

        /* SONRADAN NOTLAR */


        int j=1_000_000; // bu şekilde yazarak basamakları kolaylıkla okuyabiliriz.Sınuca etkisi yok.
        System.out.println("j = " + j);

        //Default Değerler:

        int a=0;
        String s=null;
        boolean b=false;

        Integer l=null; // bunlar non-primitive olduğu için null alabilir.
        Boolean bo=null;




    }
}
