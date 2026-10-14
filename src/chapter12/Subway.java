package chapter12;

public class Subway {
    private int lineNumber;
    private int passengerCount; //승객수
    private int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void takePerson() {
        money += 1500;
        passengerCount ++;
    }

    public void showInfo() {
        System.out.println(lineNumber + "호선 지하철의 승객은 " + passengerCount + "명, 현재 수입 " + money  + "원");
    }
}
