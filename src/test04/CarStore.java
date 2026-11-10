package test04;

import java.util.Scanner;

public class CarStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] carArr = new Car[3];

        for (int i = 0; i < carArr.length; i++) {
            System.out.print("차종/색상/가격을 순서대로 입력하세요.");

            String model = sc.nextLine();
            sc.nextLine();

            String color = sc.nextLine();
            sc.nextLine();

            int price = sc.nextInt();
            sc.nextLine();

            carArr[i] = new Car(model, color, price);
        }

        for (int i = 0; i < carArr.length; i++) {
            System.out.println("보유 차량 " + (i + 1));
            carArr[i].showCar();
        }

    }
}
