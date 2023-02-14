package Men._02_Lists;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        //sabit sayılı
        int[] numbers =new int[10];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        System.out.println("numbers= "+Arrays.toString(numbers));

        int numbers2[]=new int[10]; //C-style programlama dilinde
        numbers2[0]=10;
        numbers2[2]=20;
        numbers2[3]=30;
        System.out.println("numbers2= "+Arrays.toString(numbers2));

        int[] numbers3={20,10,30};
        System.out.println("numbers3= "+Arrays.toString(numbers3));

        // Array ler Primitive ve Non-Primitive tiplerde kullanılabilir.
        Car[] cars=new Car[3];
        cars[0] = new Car("Honda",1998);
        cars[1] = new Car("BMW",2000);
        cars[2] = new Car("Mercedes",2020);
        System.out.println("Car class ı Array = "+Arrays.toString(cars));

        //Her elemana ulaşma
        System.out.println("for: ");
        for (int i = 0; i < numbers3.length; i++) {

            System.out.print(numbers3[i]+"-");
        }
        System.out.println("\nforeeach ");
        for (int each : numbers3){
            System.out.print(each+"-");}

        //Sıralandırma
        Arrays.sort(numbers3);
        System.out.println("sorted :"+Arrays.toString(numbers3));

        //2 boyutlu Array

        int[][] numberList=new int[3][4];
        numberList[0][0] = 10;
        numberList[0][1] = 20;
        numberList[0][2] = 30;
        numberList[1][0] = 40;
        numberList[1][1] = 50;
        numberList[1][2] = 60;

        System.out.println("2D Array= "+Arrays.deepToString(numberList));

        // 2. tanımlama yöntemi

        int[][] numberList2={{10,20,30},   // 0.0, 0.1, 0.2
                             {40,50,60}};  // 1.0, 1.1, 1.2











    }
}
