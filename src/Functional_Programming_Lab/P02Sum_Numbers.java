package Functional_Programming_Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P02Sum_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<int[], String> count = elements -> "Count = " +
                elements.length;
        Function<int[], String> sum = stream -> "Sum = " +
                Arrays.stream(stream).sum();



        int[] intStream = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(count.apply(intStream));
        System.out.println(sum.apply(intStream));

    }
}
