package test05_01;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        sc.nextLine();

        int height = sc.nextInt();

        Rectangle rectangle = new Rectangle(height, width);

        rectangle.showInfo();
    }
}
