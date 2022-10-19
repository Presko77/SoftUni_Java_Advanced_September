package Exam_Preparation;

import java.util.*;
import java.util.stream.Collectors;

public class P01Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> males = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .forEach(males::push);

        ArrayDeque<Integer> females = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));
        int matches =0;
        List<Integer> malesLeft = new ArrayList<>();
        List<Integer> femaleLeft = new ArrayList<>();

        int male = males.peek();
        int female = females.peek();
        while (!males.isEmpty() && !females.isEmpty()) {
             male = males.peek();
             female = females.peek();

                if (male <= 0){
                   males.remove();
                }
                if (female <= 0 ){
                    females.remove();
                }

                if (!males.isEmpty() && !females.isEmpty()) {
                    male = males.peek();
                    female = females.peek();
                }

            if (male <= 0){
                males.remove();
            }
            if (female <= 0 ){
                females.remove();
            }

            if (!males.isEmpty() && !females.isEmpty()) {
                male = males.peek();
                female = females.peek();
            }


            if (male %25 ==0){
                males.remove();
                males.remove();
            }else if (female %25 == 0){
                females.remove();
                females.remove();

            } else if (male == female){
                matches++;
                males.remove();
                females.remove();
            }else if (male > female || female >male){
                females.remove();
                    male = male - 2;
                    males.remove();
               males.push(male);

            }
        }
        if (!males.isEmpty()){
            for (Integer integer : males) {
                malesLeft.add(integer);
            }
        }
        if (!females.isEmpty()){
            for (Integer integer : females) {
                femaleLeft.add(integer);
            }
        }
        System.out.printf("Matches: %d%n", matches);


            if (males.isEmpty()){
                System.out.print("Males left: none");

            }else
                System.out.print("Males left: ");
        System.out.print(malesLeft.stream().map(Objects::toString).collect(Collectors.joining(", ")));
        System.out.println();
            if (females.isEmpty()) {
                System.out.println("Females left: none");
            } else
                System.out.print("Females left: ");
                    System.out.print(femaleLeft.stream().map(Objects::toString).collect(Collectors.joining(", ")));



        }
    }

