package Generics_Exercises.P03Generic_Swap_Method_String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<T> {
    private List<T> values;

    public Box(){
        this.values = new ArrayList<>();
    }

    public void add(T element){
        values.add(element);
    }

    public void swap(int firstIndex, int secondIndex){
        Collections.swap(values, firstIndex, secondIndex);

//        T temp = values.get(firstIndex);
//        values.set(firstIndex,values.get(secondIndex));
//        values.set(secondIndex,temp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s: %s%n", value.getClass().getName(), value.toString()));
        }
        return sb.toString();
    }
}

