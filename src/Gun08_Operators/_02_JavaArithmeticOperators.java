package Gun08_Operators;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac=0;

        sayac=sayac+1; // sayacın degerini 1 aarttırır.
        sayac++ ; // sayacın degerini 1 aarttırır.
        ++sayac; // sayacın degerini 1 aarttırır.

        sayac=-1; //sayacın degerini 1 azalt.
        sayac--; //sayacın degerini 1 azalt.
        --sayac; //sayacın degerini 1 azalt.

        /******************************/
        int sonuc=0;
        sayac=0;
        sonuc=sayac++; // ++ veya -- ler sag tarafta ise
                        // yokmus gibi işlemi yapıcaz
                        // ++ veya -- leri yapıcaz.

        sonuc=sayac;
        sayac=sayac+1;

        // ++ lar solda
        sonuc=0;
        sayac=0;
        sonuc=++sayac;  //++ veya -- ler sol tarafta ise
                        // önce ++ veya -- ler yapılır
                        //

        /* SONRADAN NOTLAR */

        int n=3;
        System.out.println("n++ = " + n++); //3
        System.out.println("++n = " + ++n); //5
        //n++ önce işlemi yap sonra arttır.
        //++n önce arttır sonra işlemi yap.

        int a=5;

        if (a==6 && ++a>7){ // Bu bağlaçlarda kısa devre ihtimali; eğer birinci koşul çalışmazsa ikinci koşula bakmaz.

        }
        if (a==6 || ++a>7){ // Bu bağlaçlarda kısa devre ihtimali; eğer birinci koşul çalışırsa ikinci koşula bakmaz.

        }




    }
}
