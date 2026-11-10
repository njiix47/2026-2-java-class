package test05;

import java.util.Scanner;

public class CinemaTest {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("어벤져스", 10);

        Customer hong = new Customer("홍길동");
        Customer kim = new Customer("김철수");

        Scanner sc = new Scanner(System.in);

        int hongCount = sc.nextInt();
        sc.nextLine();

        int kimCount = sc.nextInt();

        cinema.reserve(hong, hongCount);
        cinema.reserve(kim, kimCount);

        System.out.println("==예약결과==");
        hong.showInfo();
        kim.showInfo();
        cinema.showInfo();
    }
}
