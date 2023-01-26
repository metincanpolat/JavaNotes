package Gun15_NestedLoop;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {
        // Bütün çarpım tablosu

        for (int j=1; j<10 ; j++) {
            for (int i = 1; i <= 10; i++) {// yukarıdaki her bir deger için çalışır
                System.out.println(j + "x" + "=" + j * i);
            }
            System.out.println("");
        }

    }
}
