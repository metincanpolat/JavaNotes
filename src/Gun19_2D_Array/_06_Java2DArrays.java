package Gun19_2D_Array;

public class _06_Java2DArrays {
    public static void main(String[] args) {

        int[][] tablo= {// 5 satır
                {4,55}, // 0.Satır
                {45,6,77}, // 1.Satır
                {4,2,999,45,56,66}, // 2.Satır
                {42,12,9}, // 3.Satır
                {4,}, // 4.Satır
        };

        System.out.println("satır miktarı= "+tablo.length+"\n");

        System.out.println("0.satırdaki sutun sayısı= "+tablo[0].length);
        System.out.println("1.satırdaki sutun sayısı= "+tablo[1].length);
        System.out.println("2.satırdaki sutun sayısı= "+tablo[2].length);
        System.out.println("3.satırdaki sutun sayısı= "+tablo[3].length);
        System.out.println("4.satırdaki sutun sayısı= "+tablo[4].length);

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+"\t");
            }
            System.out.println();

        }




    }
}
