package OCA_Sorular._01;

public class _2D_arrays_break {
    public static void main(String[] args) {

        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " "); // A B D E

                if (arr[i][j].equals("B")) {
                    break;
                }
            }

            continue;  //tamamen etkisiz
        }
    }
}
