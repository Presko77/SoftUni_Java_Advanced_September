package Stacks_and_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int countToPush = Integer.parseInt(input[0]);
        int countToPop = Integer.parseInt(input[1]);
        int elementToSearch = Integer.parseInt(input[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] numbersToAdd = scanner.nextLine().split(" ");

        for (int i = 0; i < countToPush; i++) {
            stack.push(Integer.parseInt(numbersToAdd[i]));
        }
        for (int i = 0; i < countToPop; i++) {
            stack.pop();
        }
        if (stack.isEmpty()){
            System.out.println("0");
        }else if (stack.contains(elementToSearch)){
            System.out.println("true");
        }else {
            int minElement = Integer.MAX_VALUE;
            for (Integer number : stack) {
                if (number < minElement) {
                    minElement = number;
                }
            }
            System.out.println(minElement);
        }
    }
}
