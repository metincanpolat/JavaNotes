package Gun33_Encapsulation._02_Ornek;

public class ArabaMain {
    public static void main(String[] args) {
        // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
        // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
        // Main de 1 tane nesne oluşturup bunu kontrol ediniz.
        Araba model1=new Araba();
        model1.setKapiSayisi(5);
        model1.setRenk("mavi");
        model1.setModel(2021);
        model1.setMotorHacmi(1600);




        Araba model2=new Araba("kırmızı",2020,1.6,4);

        System.out.println("model2 = " + model2);


        // KURAL: genel yazılım kuralıdır.
        // bütün değişkenler private yapılır.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.


    }
}
