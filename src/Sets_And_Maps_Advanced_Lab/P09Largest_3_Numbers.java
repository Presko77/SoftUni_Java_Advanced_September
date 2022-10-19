package Sets_And_Maps_Advanced_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P09Largest_3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.sort(numbers);
        Collections.reverse(numbers);
        List<Integer> topNumbers = new ArrayList<>();
        for (int i = 0; i < Math.min(3, numbers.size()); i++) {
            topNumbers.add(numbers.get(i));
        }
        System.out.println(String.join(" ", topNumbers.toString().replaceAll("[\\[\\],]", "")));
    }
}
