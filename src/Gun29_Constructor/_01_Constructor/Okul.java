package Gun29_Constructor._01_Constructor;

public class Okul {
    public static void main(String[] args) {
        // Bir Student sınıfı oluşturunuz
        //(id(int), name, surName, classroom(int)) ve
        // bundan 3 adet öğrenci oluşturunuz.

        //1. yöntem

        Student ogr1=new Student(); //nesnenin oluşturulma anı
                                    // () bu bir metod işareti
        ogr1.id=1;
        ogr1.name="ismet";
        ogr1.surName="temur";
        ogr1.classroom=11;
        System.out.println("ogr1.name = " + ogr1.name);

        //2.Yöntem

        Student ogr2=new Student(1,"mehmet","temur",11);
        System.out.println("ogr2 = " + ogr2.name);

        Student ogr3=new Student(3,"Hatice","demir");

        System.out.println("ogr3 = " + ogr3.name);
        System.out.println("ogr3.classroom = " + ogr3.classroom);






    }
}
