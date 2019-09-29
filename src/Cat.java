public class Cat extends Animal {
    public Cat(String name,double weight){
        super(name,weight);
        typeOfFood=FoodType.CATFOOD;
        weightOfFood=Math.round(weight/150);

    }


}
