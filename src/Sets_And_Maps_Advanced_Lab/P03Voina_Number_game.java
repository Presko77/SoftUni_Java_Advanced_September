package Sets_And_Maps_Advanced_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P03Voina_Number_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayerSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondPlayerSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        int rounds = 50;
        while (rounds > 0) {
            int firstPlayerCard = firstPlayerSet.iterator().next();
            firstPlayerSet.remove(firstPlayerCard);
            int secondPlayerCard = secondPlayerSet.iterator().next();
            secondPlayerSet.remove(secondPlayerCard);
            Set<Integer> winningSet = (firstPlayerCard > secondPlayerCard) ? firstPlayerSet
                    : (firstPlayerCard < secondPlayerCard) ? secondPlayerSet
                    : null;
            if (winningSet != null) {
                winningSet.add(firstPlayerCard);
                winningSet.add(secondPlayerCard);
            }
            if (firstPlayerSet.isEmpty() || secondPlayerSet.isEmpty()) break;
            rounds--;
        }
        System.out.println((firstPlayerSet.size() > secondPlayerSet.size()) ? "First player win!"
                : (secondPlayerSet.size() > firstPlayerSet.size()) ? "Second player win!"
                : "Draw!"
        );
    }
}
