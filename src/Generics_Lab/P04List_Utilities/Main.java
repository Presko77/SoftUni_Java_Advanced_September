package Generics_Lab.P04List_Utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 3, 7, 10);

        System.out.println(ListUtils.getMax(numbers));
        System.out.println(ListUtils.getMin(numbers));

        List<String> string = List.of("A", "Pres" ,"B", "UwU");

        System.out.println(ListUtils.getMax(string));
        System.out.println(ListUtils.getMin(string));
    }
}
