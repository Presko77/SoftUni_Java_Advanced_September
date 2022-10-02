package Defining_Classes_Lab.Car_Info;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> info = Arrays.stream(scanner.nextLine().split(" ")).toList();
            Car car = new Car();
            car.setBrand(info.get(0));
            car.setModel(info.get(1));
            car.setHorsePower(Integer.parseInt(info.get(2)));
            cars.add(car);

        }
        for (Car car : cars) {
            System.out.println(car.getInfo());
        }
    }
}
