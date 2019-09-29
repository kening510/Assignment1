public class Snake extends Animal {
    public Snake(String name,double weight){
        super(name,weight);
        typeOfFood=FoodType.SNAKEFOOD;
        weightOfFood=20.0;
    }
}
