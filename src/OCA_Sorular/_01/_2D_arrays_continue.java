package OCA_Sorular._01;

public class _2D_arrays_continue {
    public static void main(String[] args) {
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

                if (arr[i][j].equals("B")) {
                    continue;
                }

                //System.out.println("jfhdjdd"); // böyle bir kod olsaydı yukarıdaki continue çalışaaktı.
                // bu kod if parantez içerisinde olsaydı hata verirdi.

            }

            continue;  //tamamen etkisiz
        }
    }
}
