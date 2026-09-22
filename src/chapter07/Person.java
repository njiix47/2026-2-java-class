package chapter07;

public class Person {
    String name;
    int height;
    int weight;

    public Person() {}

    public Person(String personName) {
        name = personName;
    }

    public Person(String personName, int personHeight, int personWeight) {
        name = personName;
        height = personHeight;
        weight = personWeight;
    }
}
