package Men._02_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Arraylist bir collection dır. Diğer collection lara internetten bakabilirsin.

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);

        ArrayList<Integer> numbers2=new ArrayList<>(numbers);
        System.out.println("numbers2 = " + numbers2);

        ArrayList<Integer> numbers3=new ArrayList<>(Arrays.asList(10,20,30));
        //ArrayList<Integer> numbers4=new ArrayList<>(List.of(30,20,10)); // Java 8 üzeri sürümlerde kullanılabilir.

        ArrayList<Car> cars=new ArrayList<>();
        cars.add(new Car("Honda",2002));
        cars.add(new Car("BMW",2000));
        cars.add(new Car("Mercedes",2020));

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (Car car : cars)
            System.out.println(car);

        // ArrayListlerde sıralama
        Collections.sort(numbers2);
        System.out.println("numbers2 sorted= " + numbers2);

        ArrayList<ArrayList<Integer>> numberList=new ArrayList<>();
        numberList.add(numbers);
        numberList.add(numbers2);
        numberList.add(numbers3);


        System.out.println("numberList = " + numberList);




    }
}
