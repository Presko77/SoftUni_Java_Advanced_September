package Functional_Programming_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P01Sort_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer ::parseInt)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numbers.stream()
                        .map(String::valueOf)
                                .collect(Collectors.joining(", ")));

        System.out.println(numbers.stream().sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));

    }
}
