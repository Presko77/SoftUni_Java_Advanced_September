package Functional_Programming_Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P03Custom_Min_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> function = (int[] arr) -> {
            int min = Integer.MAX_VALUE;
            for (int number : arr) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        };
      int min = function.apply(numbers);
        System.out.println(min);
            }


    }

