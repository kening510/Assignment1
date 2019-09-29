import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.List;


public class AnimalHotel {
    protected List<Animal> animalList = new ArrayList<>();

    public AnimalHotel(){
        Cat cat1 = new Cat("Venus", 5000);
        Cat cat2 = new Cat("Ove", 3000);

        Dog dog1 = new Dog("Sixten", 5000);
        Dog dog2 = new Dog("Dogge", 10000);

        Snake snake = new Snake("Hypno", 1000);

        animalList.add(cat1);
        animalList.add(cat2);
        animalList.add(dog1);
        animalList.add(dog2);
        animalList.add(snake);
    }

    /**
     * return the animal if it exists otherwise it returns null
     * @param name  The name of the animal
     * @return the animal or null
     */

    public Animal getAnimal(String name){

        Animal animalFromGetAnimal = null;
        for (Animal animal : animalList) {
            if (name.trim().toLowerCase().equals(animal.getName().toLowerCase())) {
                animalFromGetAnimal = animal;
                break;
            }
        }

        return animalFromGetAnimal;
    }
}
