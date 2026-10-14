package chapter12;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentKim = new Student("김태윤", 1000);
        Bus busA = new Bus(121);

        Student studentRu = new Student("류우연", 3000);
        Subway subwayA = new Subway(2);

        studentKim.getBus(busA);
        studentKim.showInfo();

        studentRu.getSubway(subwayA);
        studentRu.showInfo();


    }
}
