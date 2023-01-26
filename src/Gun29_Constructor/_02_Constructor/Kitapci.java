package Gun29_Constructor._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {

        // Book class yazınız.fields: name,publishYear,author.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.


        Book kitap1=new Book(); //1.Constructor
        kitap1.name="Harry Poter";
        kitap1.author="JK Rowling";
        kitap1.publishYear=1997;


        Book kitap2=new Book("yüzükler","JRR Tolkien"); //2.Constructor
        Book kitap3=new Book("Sefiller"); // 3.Constructor

        kitap1.yazdir();
        kitap2.yazdir();

        System.out.println("kitap1 = " + kitap1.toString()); //toString yazmasak da olur
        System.out.println("kitap1 = " + kitap1);
        System.out.println("kitap2 = " + kitap2);
        System.out.println("kitap3 = " + kitap3); //kendisi direk toString metodunu buluyor

















    }
}
