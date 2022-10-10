package Generics_Exercises.P05Generic_Count_Method_String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<String> box = new Box<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String element = scanner.nextLine();
            box.add(element);
            
        }
        String elementToCompare = scanner.nextLine();
        System.out.println(box.countOfGreaterItems(elementToCompare));

    }
}
