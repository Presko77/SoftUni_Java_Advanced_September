package Exam_Preparation;

import java.util.*;
import java.util.stream.Collectors;

public class P01Its_Chocolate_Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Double> firstLineMilk = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Double> secondLineCacao = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble)
                .forEach(secondLineCacao::push);


        Map<String, Integer> chocolateIveMade = new TreeMap<>();

        int milkChocolate = 0;
        int darkChocolate = 0;
        int bakingChocolate = 0;

        while (!firstLineMilk.isEmpty() && !secondLineCacao.isEmpty()){
            double currentMilk =  firstLineMilk.peek();
            double currentCacao = secondLineCacao.peek();

            double percentage = currentCacao / (currentMilk + currentCacao) * 100;

            if (percentage == 30){
                chocolateIveMade.put("Milk Chocolate" ,milkChocolate + 1);
                milkChocolate++;
                firstLineMilk.remove();
                secondLineCacao.remove();
            }else if (percentage == 50){
                chocolateIveMade.put("Dark Chocolate" ,darkChocolate + 1);
                darkChocolate++;
                firstLineMilk.remove();
                secondLineCacao.remove();
            }else if (percentage == 100){
                chocolateIveMade.put("Baking Chocolate" ,bakingChocolate + 1);
                bakingChocolate++;
                firstLineMilk.remove();
                secondLineCacao.remove();
            }else{
                secondLineCacao.remove();
                double milk = currentMilk +1;
                firstLineMilk.remove();
                firstLineMilk.offer(milk);
            }


        }

        if (chocolateIveMade.size() == 3){
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        }else{
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }


        for (Map.Entry<String, Integer> chocolate : chocolateIveMade.entrySet()) {
            System.out.printf(" # %s --> %d%n", chocolate.getKey(), chocolate.getValue());
        }
    }
}
