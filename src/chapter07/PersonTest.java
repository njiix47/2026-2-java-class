package chapter07;

import java.sql.SQLOutput;

public class PersonTest {
    public static void main(String[] args) {
        Person PersonLee = new Person("이건주");
        Person PersonKim = new Person();
        Person PersonPark = new Person("박찬희", 170, 70);

        System.out.println(PersonLee.name);
        System.out.println(PersonPark.name + PersonPark.height + PersonPark.weight);

        PersonKim.name = "김태율";
        System.out.println(PersonKim.name);
    }
}
