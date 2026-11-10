package test05;

public class Car {
    private int num;
    private String carNumber;
    private int carType;
    private int dailyPrice;
    private Boolean rented;
    public int serialNum = 101;

    public Car(String carNumber, int carType,int dailyPrice) {
        this.carNumber = carNumber;
        this.carType = carType;
        this.dailyPrice = dailyPrice;

        this.num = serialNum;
        serialNum++;
    }

    public int rent(int days) {
        return dailyPrice *  days;
    }

    public void showInfo() {
        System.out.println("관리번호: " + serialNum);
        System.out.println("차량번호: " + carNumber);
        System.out.println("차종: " + carType);
        System.out.println("1일 대여 요금: " + dailyPrice);
        System.out.println("대여 상태: " + rented);
    }
}
