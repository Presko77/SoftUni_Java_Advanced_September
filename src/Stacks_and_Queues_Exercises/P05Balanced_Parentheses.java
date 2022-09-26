package Stacks_and_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String brackets = scanner.nextLine();
        boolean isBalance = true;

        ArrayDeque<Character> openingBracket = new ArrayDeque<>();

        for (int i = 0; i < brackets.length(); i++) {
            char currentBracket = brackets.charAt(i);

            if (currentBracket== '(' || currentBracket == '[' || currentBracket == '{') {
                openingBracket.push(currentBracket);
            }else{
                if (openingBracket.isEmpty()) {
                    isBalance = false;
                    break;
                }
                char lastOpeningBracket = openingBracket.pop();
                if (currentBracket == '}' && lastOpeningBracket != '{') {
                    isBalance = false;

                }else if (currentBracket == ')' && lastOpeningBracket != '(') {
                    isBalance = false;

                }else if (currentBracket == ']' && lastOpeningBracket != '[') {
                    isBalance = false;

                }
            }
        }
        if (isBalance && openingBracket.isEmpty()) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
