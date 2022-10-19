package Exam_Preparation;

import java.util.*;
import java.util.stream.Collectors;

public class P01Autumn_Cocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //дава ми 50/100 ;-;

        ArrayDeque<Integer> buckets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> freshness = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .forEach(freshness::push);


        int bucket = buckets.peek();
        int fresh = freshness.peek();

        int currentShots = 0;
        Map<String, Integer> all = new TreeMap<>();
        int pearSour = 0;
        int theHarvest = 0;
        int appleHinny = 0;
        int highFashion = 0;

        int size = buckets.size();

        while (!(size==0)){



            int mix = bucket * fresh;
            if (!buckets.isEmpty()) {
                bucket = buckets.remove();
            }
            if (!buckets.isEmpty()){
                bucket = buckets.peek();
            }
            if (!freshness.isEmpty()) {
                fresh = freshness.remove();
            }
            if (!freshness.isEmpty()){
                fresh = freshness.peek();
            }



            if (mix == 150){
                pearSour++;
                all.put("Pear Sour", pearSour);

            }else if (mix == 250){
                theHarvest++;
                all.put("The Harvest",theHarvest);

            }else if (mix == 300){
                appleHinny++;
                all.put("Apple Hinny",appleHinny);

            }else if (mix == 400){
                highFashion++;
                all.put("High Fashion",highFashion);
            }

            size--;
        }

        if (appleHinny >=1){
            currentShots++;
        }
        if (highFashion >=1){
            currentShots++;
        }
        if (pearSour >=1){
            currentShots++;
        }
        if (theHarvest >=1){
            currentShots++;
        }

//        int ingredients = 0;
//        int a = 0;
//        int b = 0;
//        if (!buckets.isEmpty() && !freshness.isEmpty()){
//            while (!buckets.isEmpty() && !freshness.isEmpty()){
//              a =  buckets.peek();
//               b= freshness.peek();
//               ingredients = a + b;
//            }
//        }


        if (currentShots == 4){
            System.out.println("It's party time! The cocktails are ready!");

            for (Map.Entry<String, Integer> entry : all.entrySet()) {
                System.out.printf("# %s --> %d%n",entry.getKey(),entry.getValue());
            }

        }else{
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");

            //Не знам как да го направя
            int sum = 0;
            for (Integer element : buckets) {
                sum = sum+element;
            }
            System.out.printf("Ingredients left: %d%n",sum);

            for (Map.Entry<String, Integer> entry : all.entrySet()) {
                System.out.printf("# %s --> %d%n",entry.getKey(),entry.getValue());
            }
        }
    }
}
