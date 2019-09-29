import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {

        AnimalHotel animalHotel = new AnimalHotel();


        String s = showInputDialog("Who will get food?");
        while (true) {

            Animal animal = animalHotel.getAnimal(s);
            if (animal != null) {
                showMessageDialog(null, "You will give " + animal.getName() + " " + animal.getAmountOfFood() + "g "
                        + animal.getRightFood().toString().toLowerCase() + " !");
                break;
            } else {
                s = showInputDialog("Please write their right names.");
            }

        }

    }
}