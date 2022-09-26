package Sets_And_Maps_Advanced_Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04Count_Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        TreeMap<Character, Integer> symbolMap = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!symbolMap.containsKey(currentChar)) {
                symbolMap.put(currentChar, 1);
            } else {
                int currentOccurrences = symbolMap.get(currentChar);

                symbolMap.put(currentChar, currentOccurrences + 1);
            }
        }


        for (var pair : symbolMap.entrySet()) {
            System.out.printf("%s: %d time/s%n", pair.getKey(), pair.getValue());
        }
        }
    }

