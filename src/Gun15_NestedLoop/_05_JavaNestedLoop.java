package Gun15_NestedLoop;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *
        for (int i=0; i<=5 ; i++){
            for (int j=0;j<i;j++)
                System.out.print("*");
            System.out.println();}
        for (int i=5; i>0; i-- ) { // i -> 5 4 3 2 1
            for (int j = 0; j < i; j++) // satır değeri kadar yaz (i)
                System.out.print("*");
            System.out.println(); // satır işi bitince satır atla
        }





    }
}