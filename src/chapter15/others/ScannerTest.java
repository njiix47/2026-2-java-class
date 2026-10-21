package chapter15.others;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("사번을 입력하세요 : ");
        int ID = sc.nextInt();

        sc.nextLine();

        System.out.print("직업을 입력하세요 : ");
        String job = sc.nextLine();

        System.out.println("이름 : " + name);
        System.out.println("사번 : " + ID);
        System.out.println("직업 : " + job);
    }
}
