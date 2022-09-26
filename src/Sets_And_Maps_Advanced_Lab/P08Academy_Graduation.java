package Sets_And_Maps_Advanced_Lab;

import java.util.*;


public class P08Academy_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> gradesByStudents = new TreeMap<>();

        while (n--> 0) {
            String name = scanner.nextLine();

            double grade = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .average().orElse(0);

            gradesByStudents.put(name, grade);

        }
        gradesByStudents.forEach((name, grade) -> System.out.printf("%s is graduated with %f%n",name, grade));

    }
}
