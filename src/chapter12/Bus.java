package chapter12;

public class Bus {
    private int busNumber;
    private int passengerCount; //승객수
    private int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void takePerson() {
        money += 1000;
        passengerCount ++;
    }

    public void showInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명, 현재 수입 " + money  + "원");
    }
}
