package OCA_Sorular._04_Static._02;

public class Order {
    String m="m";
    static String value = "t";
    static{ value += "a"; }
    { value += "c"; }
    public Order() {
        m="h";
        value += "b";
    }
    public Order(String s) {
        value += s;
        m="k";
    }
    public static void main(String[] args) {
        Order order = new Order("f");
        order = new Order();
        System.out.println(order.value + order.m);
    }
}
/*
        A. tacb
        B. tacfcbk
        C. tacbfh
        D. tacfcbh
        E. tacftach
        F. Kod calismaz.
        G. Kod calisir ama exception olusur.

        Çözüm:
        https://www.youtube.com/watch?v=oZNPeiQzyfA

 */
