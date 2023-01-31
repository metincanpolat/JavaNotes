package ZDeneme._01;

import java.util.Arrays;

public class alfa {

    int i=5;

    public static void main(String[] args) {

        //int[] c={1, 3, 6, 4, 1, 2};
        //System.out.println("theSmallest(c) = " + theSmallest(c));

        int[] c = {1,1,1,1,2,2,998, 6,5, -4,3, 1, 2};
        Arrays.sort(c);
        int missingNumber = 1;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == missingNumber) {
                missingNumber++;
            } else if (c[i] > missingNumber) {
                break;
            }
        }
        System.out.println("Missing number: " + missingNumber);




    }

    public static int theSmallest(int[] abc) {
        int counter = 0;
        //for (int i = 0; i < 1_000_000; i++) {

        Boolean equal=true;
        Arrays.sort(abc);

        if (Arrays.stream(abc).max().getAsInt()<0)
            return 5222;
        else
            while (equal) {
                counter++;
                for (int e : abc) {
                    if (e == counter){
                        equal = true;
                    System.out.println(counter);}
                    else equal = false;break;
                }
            }
            return counter;



    }
}


