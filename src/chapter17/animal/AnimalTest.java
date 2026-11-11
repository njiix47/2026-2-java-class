package chapter17.animal;

public class AnimalTest {
    public static void main(String[] args) {
//        AnimalTest atest = new AnimalTest();
//
//        atest.moveAnimal(new Human());
//        atest.moveAnimal(new Tiger());
//        atest.moveAnimal(new Eagle());

        Animal ani = new Tiger(); // 업캐스팅 (묵시적으로 가능)

        if (ani instanceof Human hu) {
            hu.move();
        } else if (ani instanceof Tiger t) {
            t.move();
        }
    }

    public void moveAnimal(Animal ani) {
        ani.move();
    }
}
