package Exam_Preparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01KAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstLineLicensePlates = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondLineCars = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .forEach(secondLineCars::push);

        int countOfRegisteredCars = 0;
        int countOfInstallationDays = 0;

        while (!firstLineLicensePlates.isEmpty() && !secondLineCars.isEmpty()) {
            countOfInstallationDays++;
            int currentNumberOfPlate = 0;
            int plates = firstLineLicensePlates.peek();
            int cars = secondLineCars.peek();

            for (int i = 0; i < 1; i++) {
                currentNumberOfPlate = firstLineLicensePlates.poll();
            }

            int currNumberOfCars = 0;
            for (int i = 0; i < 1; i++) {
                currNumberOfCars = secondLineCars.pop();
            }

            if (plates > (cars * 2)) {
                firstLineLicensePlates.addLast(plates - (cars * 2));
                countOfRegisteredCars += cars;
            } else if (plates < (cars * 2)) {
                int leftCars = cars - (plates / 2);
                secondLineCars.addLast(leftCars);

                countOfRegisteredCars += (plates / 2);
            } else {
                countOfRegisteredCars += cars;
            }
        }


        System.out.printf("%d cars were registered for %d days!%n" ,countOfRegisteredCars ,countOfInstallationDays) ;
        if (!firstLineLicensePlates.isEmpty()) {
            long sumOfUnplacedPlates = 0;
            while (!firstLineLicensePlates.isEmpty()){
                sumOfUnplacedPlates += firstLineLicensePlates.poll();
            }
            System.out.printf("%d license plates remain!" ,sumOfUnplacedPlates);
        } else if (!secondLineCars.isEmpty()){
            long sumOfCarsWithoutPlate = 0;
            while (!secondLineCars.isEmpty()) {
                sumOfCarsWithoutPlate += secondLineCars.pop();
            }
            System.out.printf("%d cars remain without license plates!" ,sumOfCarsWithoutPlate);
        } else {
            System.out.println("Good job! There is no queue in front of the KAT!");
        }
        }
    }

