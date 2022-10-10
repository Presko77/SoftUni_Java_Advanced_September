package Generics_Exercises.P03Generic_Swap_Method_String;

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
        String[] indices = scanner.nextLine().split(" ");
        int firstIndex = Integer.parseInt(indices[0]);
        int secondIndex = Integer.parseInt(indices[1]);

        box.swap(firstIndex, secondIndex);

        System.out.println(box);
    }
}
