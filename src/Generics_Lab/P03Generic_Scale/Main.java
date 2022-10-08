package Generics_Lab.P03Generic_Scale;

public class Main {
    public static void main(String[] args) {


        Scale<Integer> integerScale = new Scale<>(7, 2);
        System.out.println(integerScale.getHeavier());

        Scale<String> stringScale = new Scale<>("A", "B");
        System.out.println(stringScale.getHeavier());
    }
}
