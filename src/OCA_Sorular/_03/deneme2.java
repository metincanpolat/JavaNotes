package OCA_Sorular._03;

public class deneme2 {
    public static void main(String[] args) {

        MyField m1 = new MyField();

        m1.x =100;
        m1.y=200;



        MyField m2 = new MyField();
        m2.doStuff(m1.x,m1.y);
        m1.display();
        m2.display();


    }
}
