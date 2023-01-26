package Gun40._02_Ornek._01static;

public class ABMain {
    public static void main(String[] args) {

        A a=new A(); // buna gerek yok şaşırtmak için, a A lara dikkat
        System.out.println("A.mesaj = " + A.mesaj);
        

        B b=new B(); // burada değiştirildi
        System.out.println("B.mesaj = " + B.mesaj);
        
        A a2=new A();
        System.out.println("A.mesaj = " + A.mesaj);

        //statik olduğu için sen bir tanesin, class a ait olduğu için tek ataması var
        // B de değiştirdiğimiz için A daki de değişiyor
        // statik olmayan hali ikinci dosyada


    }
}
