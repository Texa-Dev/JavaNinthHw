package task4;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {


    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 100);
        }
        IntStream stream = Arrays.stream(arr);

        // Task4.1 Выведете этот стрим в консоль помощью Stream API.

        stream.forEach(x -> System.out.print(x+" "));
        stream = Arrays.stream(arr);
        System.out.println();
        // Task 4.2 выведете в консоль:
        // количество всех чисел
         System.out.println("Count of stream: "+ stream.count());

       // Task 4.3 количество четных и нечетных чисел
        stream = Arrays.stream(arr);
         System.out.println("Count even value: " + stream.filter(value -> value % 2 == 0).count());
        stream = Arrays.stream(arr);
         System.out.println("Count odd value: "+ stream.filter(value -> value % 2 != 0).count());

        //Task 4.4 максимальное и минимальное значение
        stream = Arrays.stream(arr);
        System.out.println("Max value " + stream.reduce(Integer::max).orElse(0));
        stream = Arrays.stream(arr);
        System.out.println("Min value " + stream.min().getAsInt());

        //Task 4.5 среднее и сумму всех чисел
        stream = Arrays.stream(arr);
        System.out.println();
        System.out.println("Average value: "+ stream.average().orElse(0));
        stream = Arrays.stream(arr);
        System.out.println("Sum: "+ stream.sum());

    }
}
