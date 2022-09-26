package Sets_And_Maps_Advanced_Exercises;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class P03Periodic_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfCompounds = Integer.parseInt(scanner.nextLine());

        TreeSet<String> elements = new TreeSet<>();
        for (int i = 0; i < numbersOfCompounds; i++) {
            String[] compound = scanner.nextLine().split(" ");
            Collections.addAll(elements, compound);
        }
        String result = String.join(" ", elements);
        System.out.println(result);
    }
}
