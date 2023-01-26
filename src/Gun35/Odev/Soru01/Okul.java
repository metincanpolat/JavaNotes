package Gun35.Odev.Soru01;

public class Okul {
    public static void main(String[] args) {
        //Burada iki adet class vardır. Biri **Main**, diğeri ise **student ,**
        //**student classı içinde;**
        //String name(isim) ve int age(yaş) isminde variables(değişkenler) oluşturunuz.
        //getter ve setter ( alıcı ve ayarlayıcı ) oluşturunuz.
        //**Main classın içinde**;
        //Örnek:
        //**age 12**'dir.
        //**name Steven**'dır.
        //name(isim) olarak;
        //**"Student name is Steven"**
        //ve
        //age(yaş) olarak da;
        //"He is 12 years old"

        Student student=new Student();
        student.setName("Steven");
        student.setAge(12);

        student.namePrint();
        student.agePrint();






    }
}
