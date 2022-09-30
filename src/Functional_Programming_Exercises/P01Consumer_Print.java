package Functional_Programming_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class P01Consumer_Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();

        Consumer<String> consumer = System.out::println;

        for (String name : names) {
            consumer.accept(name);

        }
    }

}

