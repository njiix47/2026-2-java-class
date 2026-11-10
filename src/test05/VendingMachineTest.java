package test05;

import java.util.Scanner;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine("콜라", 1500, 10);

        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();

        machine.sell(quantity);
        machine.showInfo();
    }
}
