
public class Animal implements IFood, IWeightFood {
    private String name;
    private double weight;
    protected FoodType typeOfFood;
    protected double weightOfFood;


    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public FoodType getRightFood() {
        return typeOfFood;
    }

    @Override
    public double getAmountOfFood() {
        return weightOfFood;
    }
}
