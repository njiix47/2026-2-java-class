package test05_01;

import java.util.Scanner;

public class CinemaTest {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("어벤져스", 10);

        Customer hong = new Customer("홍길동");
        Customer kim = new Customer("김철수");

        Scanner sc = new Scanner(System.in);

        int count1 = sc.nextInt();
        sc.nextLine();

        int count2 = sc.nextInt();

        cinema.reserve(hong, count1);
        cinema.reserve(kim, count2);

        hong.showInfo();
        kim.showInfo();

        cinema.showInfo();
    }
}
