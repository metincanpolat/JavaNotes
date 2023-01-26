package Gun40._02_Ornek._02;

public class ABMain {
    public static void main(String[] args) {

        A a=new A(); // buna gerek yok şaşırtmak için, a A lara dikkat
        System.out.println("A.mesaj = " + a.mesaj);
        

        B b=new B(); // burada değiştirildi
        System.out.println("B.mesaj = " + b.mesaj);
        
        A a2=new A();
        System.out.println("A.mesaj = " + a2.mesaj);


    }
}
