package test05;

import java.util.Scanner;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return width * 2 + height * 2;
    }

    public void showInfo() {
        System.out.println("가로 : " + width + "\n세로 : " + height + "\n넓이 : " + getArea() + "\n둘레 : " + getPerimeter());
    }
}