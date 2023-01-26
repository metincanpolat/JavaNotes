package Gun20_Method;

public class _02_JavaMethod {
    //buraya metod yazılabilir.Mainin dışına, yukarıya veya aşağıya.Aşağısı tercih edilir.
    public static void main(String[] args) { // ana çalışan kısım burası, buradan diğerlerini çağıracağız.
        Math.max(5,6); // bir şeyler gönderiliyor, geriye değer alınıyor
        Math.random();// birşeyler gönderilmiyor, geriye değer alınıyor.

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz(); // kullanımı kolay, çağırması kolay, tekrar tekrar kullanabilirsin.
        merhabaYaz(); // main in içi daha kolay anlaşılabiir olur.
        merhabaYaz(); // fonksiyonu çağırma şekli.

    } //main in bitişi

    // burası methodların yazılacağı yerler

    public static void merhabaYaz()
    {
        System.out.println("fonksiyonda/metodda Merhaba Dünya");


    }

    // Metodlar tekarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    //temiz kod için
}
