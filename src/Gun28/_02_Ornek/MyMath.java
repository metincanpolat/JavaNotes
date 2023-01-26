package Gun28._02_Ornek;

public class MyMath {

    static int getPow(int sayi1,int sayi2)
    {
        int top=1;
        for (int i = 0; i < sayi2; i++) {
             top=sayi1*top;
        }
        return top;
    }

    static int getMin(int sayi1,int sayi2)
    {
        int sonuc;
        if (sayi1>sayi2)
            sonuc=sayi1;
        else sonuc=sayi2;
        return sonuc;
    }

    static int getRandom(int max,int min)
    {
        return (int) (Math.random()*(max-min)+min);
    }


    static int getRandom(int max)
    {
        return (int) (Math.random()*max);
    }







}
