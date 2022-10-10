package Generics_Exercises.P04Generic_Swap_Method_Integer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<Integer> box = new Box<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Integer element = Integer.parseInt(scanner.nextLine());
            box.add(element);
            
        }
        String[] indices = scanner.nextLine().split(" ");
        int firstIndex = Integer.parseInt(indices[0]);
        int secondIndex = Integer.parseInt(indices[1]);

        box.swap(firstIndex, secondIndex);

        System.out.println(box);
    }
}
