package Generics_Exercises.P02Generic_Box_of_Integer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box_Integer<Integer> box = new Box_Integer<>();
        for (int i = 0; i < n; i++) {
            Integer element = Integer.parseInt(scanner.nextLine());
            box.add(element);
        }
        System.out.println(box);
    }
}
