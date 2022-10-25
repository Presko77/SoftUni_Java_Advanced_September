package Exam;

import java.util.*;
import java.util.stream.Collectors;

public class P01Energy_Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstLineMlCaffeine = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .forEach(firstLineMlCaffeine::push);

        ArrayDeque<Integer> secondLineEnergyDrinks = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        int currCaffeine = 0;
        int maxCaffeine = 300;

        int mlCaffeine;
        int energyDrink;

        List<Integer> caffeine = new ArrayList<>();
        List<Integer> enDrink = new ArrayList<>();

        while (!(currCaffeine >= 300) && !firstLineMlCaffeine.isEmpty() && !secondLineEnergyDrinks.isEmpty()) {

            if (!firstLineMlCaffeine.isEmpty() && !secondLineEnergyDrinks.isEmpty()) {
                mlCaffeine = firstLineMlCaffeine.peek();
                energyDrink = secondLineEnergyDrinks.peek();


                maxCaffeine = 300 - currCaffeine;

                int result = mlCaffeine * energyDrink;
                maxCaffeine = maxCaffeine - result;

                if (maxCaffeine > 0) {
                    currCaffeine = currCaffeine + result;
                    firstLineMlCaffeine.remove();
                    secondLineEnergyDrinks.remove();
                } else {

                        firstLineMlCaffeine.remove();
                        secondLineEnergyDrinks.remove();
                        secondLineEnergyDrinks.offer(energyDrink);
                        if (currCaffeine > 30) {
                            currCaffeine = currCaffeine - 30;
                        }
                }
                }


        }

        if (!secondLineEnergyDrinks.isEmpty()){
            enDrink.addAll(secondLineEnergyDrinks);
        }

        if (secondLineEnergyDrinks.isEmpty()){
            System.out.print("At least Stamat wasn't exceeding the maximum caffeine.");

        }else
            System.out.print("Drinks left: ");
        System.out.print(enDrink.stream().map(Objects::toString).collect(Collectors.joining(", ")));
        System.out.println();

        System.out.printf("Stamat is going to sleep with %d mg caffeine.%n", currCaffeine);

    }

}
