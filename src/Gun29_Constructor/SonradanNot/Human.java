package Gun29_Constructor.SonradanNot;

public class Human {
    String name;
    int age;
    int height;

    public Human() { // Bu default constructor. Hiç yazılmasaydı da default olarak arka planda yer alacaktı.
        System.out.println("A human object has been created."); // Her human objesi oluşturulduğunda ekrana yazacak
    }

    public Human(String name, int age, int height){ //Bu constructor açıldığı zaman default olanı kullanmak iatiyorsak bu sefer yazmak zorundayız.

        this(); // bunu yazarsak eğer default constructor ı da çalıştırmış oluruz.
        this.name=name;
        this.age=age;
        this.height=height;

    }
}
