package Exam_Preparation;

import java.util.*;
import java.util.stream.Collectors;

public class P01Lootbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstBox = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondBox = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .forEach(secondBox::push);

        int loot =0;


        while (!firstBox.isEmpty() && !secondBox.isEmpty()){
            int firstBoxItem = firstBox.peek();
            int secondBoxItem = secondBox.peek();


            int sum = firstBoxItem +secondBoxItem;

            if (sum%2==0){
                firstBox.poll();
                secondBox.pop();
                loot+=sum;
            }else{
                secondBox.pop();
                firstBox.offer(secondBoxItem);
            }
        }

        if (firstBox.isEmpty()){
            System.out.println("First lootbox is empty");
        }else{
            System.out.println("Second lootbox is empty");
        }

        if (loot>=100){
            System.out.printf("Your loot was epic! Value: %d", loot);
        }else{
            System.out.printf("Your loot was poor... Value: %d", loot);
        }



    }
}
