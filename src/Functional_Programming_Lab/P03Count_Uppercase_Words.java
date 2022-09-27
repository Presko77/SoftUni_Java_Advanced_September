package Functional_Programming_Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class P03Count_Uppercase_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String[] words = scanner.nextLine().split("\\s+");

        Predicate<String> isStartingWithUppercase =
                w -> Character.isUpperCase(w.charAt(0));

        ArrayDeque<String> queueOfWords = new ArrayDeque<>();

         Arrays.stream(words)
                .filter(isStartingWithUppercase)
                .forEach(queueOfWords::offer);

        System.out.println(queueOfWords.size());
        while (!queueOfWords.isEmpty()){
            System.out.println(queueOfWords.poll());
        }

    }
}
