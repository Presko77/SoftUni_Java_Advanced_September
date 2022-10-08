package Generics_Lab.P02Generic_Array_Creator;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = ArrayCreator.create(Integer.class,5,13);

        String[] strings = ArrayCreator.create(5, "Java_Generics");

        for (int i : arr) {
            System.out.print(i +" ");
        }

        for (String string : strings) {
            System.out.print(string + " ");

        }
    }
}
