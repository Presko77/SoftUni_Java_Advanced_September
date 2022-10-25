package shelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter {

    private List<Animal> data;
    private int capacity;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }


    public void add(Animal animal) {
        if (this.data.size() < this.capacity) {
            this.data.add(animal);
        }
    }

    public boolean remove(String name) {
        for (Animal currentAnimal : data) {
            if (currentAnimal.getName().equals(name)){
                data.remove(currentAnimal);
                return true;
            }
        }
        return false;
    }

    public Animal getAnimal(String name, String caretaker) {
        for (Animal currentAnimal : data) {
            if (currentAnimal.getName().equals(name) && currentAnimal.getCaretaker().equals(caretaker)){
                return currentAnimal;
            }
        }
        return null;
    }

    public Animal getOldestAnimal() {
        return data.stream().max((f , s) -> f.getAge() - s.getAge()).orElse(null);
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The shelter has the following animals:%n"));

        for (Animal animal : data) {
            sb.append(animal.getName()).append(" ").append(animal.getCaretaker()).append(System.lineSeparator());

        }
        return sb.toString();
    }
    }

