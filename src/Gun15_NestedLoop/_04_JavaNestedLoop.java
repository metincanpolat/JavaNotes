package Gun15_NestedLoop;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *****    1.Satırda 5
        // ****     2.Satırda 4
        // ***      3.Satırda 3
        // **       4.Satırda 2
        // *        5.Satırda 1

        for (int i=5; i>0; i-- ){ // i -> 5 4 3 2 1
            for (int j=0; j<i; j++) // satır değeri kadar yaz (i)
                System.out.print("*");
            System.out.println(); // satır işi bitince satır atla

        }
    }
}
