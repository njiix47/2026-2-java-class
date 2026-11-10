package test04;

import java.util.Scanner;

public class IOex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            sc.nextLine();

            sum += num;

        }

        System.out.println("합 : " + sum + " / 평균 : " + ((double)sum/10));
    }
}
