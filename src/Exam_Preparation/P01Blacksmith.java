package Exam_Preparation;

import java.util.*;
import java.util.stream.Collectors;

public class P01Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 30/100
        ArrayDeque<Integer> firstLineSteel = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondLineCarbon = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .forEach(secondLineCarbon::push);


        Map<String, Integer> swordIveMade = new TreeMap<>();

        List<Integer> steelLeft = new ArrayList<>();
        List<Integer> carbonLeft = new ArrayList<>();

        int gladius = 0;
        int shamshir = 0;
        int katana = 0;
        int sabre = 0;

        while (!firstLineSteel.isEmpty() && !secondLineCarbon.isEmpty()) {
            int steel = firstLineSteel.peek();
            int carbon = secondLineCarbon.peek();

            int count = steel + carbon;

            if (count == 70) {
                swordIveMade.put("Gladius", gladius + 1);
                gladius++;
                firstLineSteel.remove();
                secondLineCarbon.remove();
            } else if (count == 80) {
                swordIveMade.put("Shamshir", shamshir + 1);
                shamshir++;
                firstLineSteel.remove();
                secondLineCarbon.remove();
            } else if (count == 90) {
                swordIveMade.put("Katana", katana + 1);
                katana++;
                firstLineSteel.remove();
                secondLineCarbon.remove();
            } else if (count == 110) {
                swordIveMade.put("Sabre", sabre + 1);
                sabre++;
                firstLineSteel.remove();
                secondLineCarbon.remove();
            } else {
                firstLineSteel.remove();
                int currCarbon = carbon + 5;
                secondLineCarbon.remove();
                secondLineCarbon.push(currCarbon);
            }

        }
        if (!firstLineSteel.isEmpty()) {
            steelLeft.addAll(firstLineSteel);
        }
        if (!secondLineCarbon.isEmpty()) {
            carbonLeft.addAll(secondLineCarbon);
        }


        int totalNumberOfSwords = secondLineCarbon.size() + firstLineSteel.size();

        if (!swordIveMade.isEmpty()) {
            System.out.printf("You have forged %d swords.%n", totalNumberOfSwords);
        } else {
            System.out.println("You did not have enough resources to forge a sword.");
        }

        if (firstLineSteel.isEmpty()) {
            System.out.println("Steel left: none");
        } else {
            System.out.print("Steel left: ");
            System.out.print(steelLeft.stream().map(Objects::toString).collect(Collectors.joining(", ")));
            System.out.println();
        }

        if (secondLineCarbon.isEmpty()) {
            System.out.println("Carbon left: none");
        } else
            System.out.print("Carbon left: ");
        System.out.print(carbonLeft.stream().map(Objects::toString).collect(Collectors.joining(", ")));

        for (Map.Entry<String, Integer> swords : swordIveMade.entrySet()) {
            System.out.printf("%n%s: %d", swords.getKey(), swords.getValue());
        }
        }
    }


