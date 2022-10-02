package Defining_Classes_Lab.Car_Info;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public String getInfo() {
        return String.format("The car is: %s %s - %d HP.",
                this.brand, this.model, this.horsePower);
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}