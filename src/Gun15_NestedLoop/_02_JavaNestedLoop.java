package Gun15_NestedLoop;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki şekilde çıktı veren programı print içerisinde
        //            #####
        //            #####
        //            #####
        //            #####
        //            #####

        for (int j=0;j<5;j++){ // kaç satır (satır)
            for (int i=0 ; i<5 ; i++){ // kaç karakter sutun (sütun)
                System.out.print("#");
            }
            System.out.println(); // her satırdan sonra \n
        }
    }
}
