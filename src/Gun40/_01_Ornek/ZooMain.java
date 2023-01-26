package Gun40._01_Ornek;

public class ZooMain {
    public static void main(String[] args) {

        Animal a1=new Cat("köpük",false,"01/01/2010");
        System.out.println(a1);

        Cat c1=new Cat("köpük",false,"01/01/2010");
        System.out.println(c1);

        Animal eagle=new Eagle("Kartal",true,"01/01/2013");
        System.out.println("kart = " + eagle);
    }
}
