public class Dog extends Animal {
    public Dog(String name,double weight){
        super(name,weight);
        typeOfFood=FoodType.DOGFOOD;
        weightOfFood=weight/100;
    }
}
