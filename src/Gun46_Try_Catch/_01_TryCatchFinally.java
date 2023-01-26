package Gun46_Try_Catch;

public class _01_TryCatchFinally {
    public static void main(String[] args) {

        long startTime=0;
        String str="12";

        try {
            startTime = System.currentTimeMillis();
            System.out.println("Hatadan önceki nokta");
            char ilkHarf = str.charAt(0);
            System.out.println("Hatadan sonraki nokta");
        }
        catch (Exception ex)
        {
            System.out.println("catch bloğu çalıştı");
        }
        finally { // try-catch in finali: her zaman çalışır.
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloğuyla ilgili son yapılacaklar");
            // hata olsun veya olmasın çalışan kısım
            // her zaman çalışır
            // işlemlerde gerye kalan yapılacaklar bu bölümde yapılır.
            // kullanım sebebi her iki durum sonrası geriye kalan yapılacaklar
            // birlikte olsun diyedir.
        }
        System.out.println("diğer çalışan kodlar");
        System.out.println("program sonu");
    }
}
