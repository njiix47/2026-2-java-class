package chapter12;

public class Student {
    private String studentName;
    private int grade;
    private int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void getBus(Bus bus) {
        bus.takePerson();
        this.money -= 1000;
    }

    public void getSubway(Subway subway) {
        subway.takePerson();
        this.money -= 1500;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 잔액은 " + money + "원입니다.");
    }
}
