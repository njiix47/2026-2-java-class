package test04;

import java.util.Scanner;

public class IOex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int In = sc.nextInt();

        for (int i = 0; i < In; i++) {
            for (int j = 1; j < In - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
