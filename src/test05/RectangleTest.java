package test05;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        sc.nextLine();

        int height = sc.nextInt();

        Rectangle rec1 = new Rectangle(width,height);
        rec1.showInfo();
    }
}
