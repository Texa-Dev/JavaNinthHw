package task4;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100];
        int a = 0;
        int b = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 101);
        }
        IntStream stream = Arrays.stream(arr);
//        for (int i : stream.toArray()) {
//            System.out.print(i+" ");
//        }

        //    System.out.println("Count of stream: "+stream.count());

       // stream.filter(value -> value % 2 == 0);
        OptionalDouble average = stream.average();
        System.out.println(average);

    }
}
