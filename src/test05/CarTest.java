package test05;

import chapter05.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;

        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(new Car("234하5678", 1, 100000));
        cars.add(new Car("555허2158", 2, 70000));
        cars.add(new Car("123호4567", 3, 90000));

        int carType = sc.nextInt();
        sc.nextLine();

        int rentalDay = sc.nextInt();

        


    }
}
