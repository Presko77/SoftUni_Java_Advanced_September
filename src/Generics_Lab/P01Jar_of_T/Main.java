package Generics_Lab.P01Jar_of_T;

public class Main {
    public static void main(String[] args) {

        Jar<String> stringJar = new Jar<>();

        stringJar.add("Ivan");
        stringJar.add("Pres");

        Jar<Integer> num = new Jar<>();

        num.add(3);

    }
}
