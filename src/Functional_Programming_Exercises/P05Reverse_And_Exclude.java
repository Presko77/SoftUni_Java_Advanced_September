package Functional_Programming_Exercises;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05Reverse_And_Exclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

      int magicNumbers = Integer.parseInt(scanner.nextLine());

        Collections.reverse(list);
        Predicate<Integer> predicate = number -> number % magicNumbers == 0;

        list.removeIf(predicate);

        list.forEach(e -> System.out.print(e + " "));
        }
    }

