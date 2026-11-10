package test05_01;

import java.util.Scanner;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine("콜라", 1500, 10);

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        machine.sell(count);

        System.out.println("==판매 후==");
        machine.showInfo();
    }
}
