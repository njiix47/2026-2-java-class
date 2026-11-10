package test05_01;

public class Car {
    private int num;
    private String carNumber;
    private String carType;
    private int dailyPrice;
    private boolean rented;

    public int serialNum = 101;

    public Car(String carNumber, String carType, int dailyPrice) {
        this.carNumber = carNumber;
        this.carType = carType;
        this.dailyPrice = dailyPrice;

        serialNum = num;
        serialNum++;
    }

    public int rent(int day) {
        return dailyPrice * day;
    }

    public void showInfo() {
        System.out.println("관리번호: " + serialNum);
        System.out.println("차량번호: " + carNumber);
        System.out.println("차종: " + carType);
        System.out.println("대여 상태: " + rented);
    }
}
