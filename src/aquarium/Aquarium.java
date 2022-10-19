package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    public List<Fish> fishInPool;
    private String name;
    private int capacity;
    private int size;

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFishInPool() {
        int fish = fishInPool.size();
        return fish;
    }


    public Fish add(Fish fish) {
        if (!fishInPool.contains(fish) && fishInPool.size() +1 <= capacity){
            this.fishInPool.add(fish);
        }
        return fish;
    }

    public boolean remove(String name) {
        for (Fish fish : fishInPool) {
            if (this.name.equals(name)){
                this.fishInPool.remove(fish);
                return true;
            }
        }
        return false;
    }

    public Fish findFish(String name) {
        Fish fish = this.fishInPool.stream()
                .filter(e -> e.getName().equals(name))
                .findFirst()
                .orElse(null);
        return fish;
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aquarium: " + this.name + " ^ Size: " + this.size +"\n");
        for (Fish fish : fishInPool) {
            sb.append(fish);
        }
        return sb.toString().trim();
    }
}
