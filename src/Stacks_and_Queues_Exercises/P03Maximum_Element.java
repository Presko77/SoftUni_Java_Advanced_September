package Stacks_and_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class P03Maximum_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = scanner.nextLine().split(" ");
            
            switch (command[0]) {
                case "1" :
                    stack.push(Integer.parseInt(command[1]));
                    break;
                    
                case "2" :
                    stack.pop();
                    break;
                    
                case "3" :
                    System.out.println(Collections.max(stack));
                    break;
            }
        }
    }
}
