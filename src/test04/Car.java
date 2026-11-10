package test04;

import java.util.Scanner;

public class Car {
        public String model;
        public String color;
        public int price;

        public Car(String model, String color, int price) {
            this.model = model;
            this.color = color;
            this.price = price;
        }

    public void showCar() {
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
    }
}
