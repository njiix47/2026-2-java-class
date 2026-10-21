package test03;
import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        dogs.add(new Dog("율이", "잡종"));
        dogs.add(new Dog("율이", "잡종"));
        dogs.add(new Dog("율이", "잡종"));
        dogs.add(new Dog("율이", "잡종"));
        dogs.add(new Dog("율이", "잡종"));

        for (Dog dog : dogs) {
            dog .showDogInfo();
        }
    }
}
