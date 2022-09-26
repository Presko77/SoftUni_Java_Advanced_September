package Stacks_and_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P01Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        Deque<String> stack = new ArrayDeque<>();

        for (String number : numbers) {
            stack.push(number);
        }
        while (!stack.isEmpty()) {
            System.out.printf("%s ",stack.pop());
        }



    }
}
