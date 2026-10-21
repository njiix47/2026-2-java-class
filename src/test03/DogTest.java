package test03;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dog = new Dog[5];

        dog[0] = new Dog("숑이", "포메라니안");
        dog[1] = new Dog("땅콩이", "진돗개");
        dog[2] = new Dog("정뭉", "삽살개");
        dog[3] = new Dog("철이", "포메라니안");
        dog[4] = new Dog("삐쭈", "푸들");

        for (Dog dogs : dog) {
            dogs.showDogInfo();
        }

    }
}
