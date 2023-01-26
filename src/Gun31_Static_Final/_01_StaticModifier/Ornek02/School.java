package Gun31_Static_Final._01_StaticModifier.Ornek02;

public class School {
    public static void main(String[] args) {
        // Student (id, name, surName)
        // Yukarıdaki gibi 5 öğrenci tanımlayınız.
        // Her öğrencinin takip eden bir id si olmalı.(otomatik artan)
        // Ve en son kaç öğrenci olduğunu bulabilmeliyim.

        Student ogr1=new Student("ismet yıldız");
        Student ogr2=new Student("Ahmet Demir");
        Student ogr3=new Student("Ayşe Yılmaz");
        // problem: hem id yi takip etmek zorunda kalıyorum
        // hata olasılığı yüksek ve gereksiz veri girişi

        //ID lere verilecek numaraları takşp eden ve her NESNE
        // oluşturuldukça ARTAN bir SAYAC olmalı
        // Bu Sayac kşme ait olmalı, nesne ye mi class a mı

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);

        System.out.println(Student.sayac);





// TODO: Printf araştır.


    }
}
