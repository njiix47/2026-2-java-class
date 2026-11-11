package chapter17.customer;

import java.util.ArrayList;

public class CustomerTest02 {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        customerList.add(new Customer(10015, "김섭규"));
        customerList.add(new Customer(10017, "진아름"));
        customerList.add(new VIPcustomer(10016, "반다니엘", 16));
        customerList.add(new GOLDcustomer(10018, "최석수"));
        customerList.add(new GOLDcustomer(10019, "최은지"));

        System.out.println("\n고객 정보 출력\n");

        for (Customer cs : customerList) {
            System.out.println(cs.showCustomerInfo());
        }

        System.out.println("\n할인율 및 포인트 계산\n");

        int price = 40000;

        for (Customer cs : customerList) {
            int cost = cs.calcPrice(price);
            System.out.println(cs.customerName + "님이 " + cost + "원을 지불하셨습니다." + "\n현재 보너스 포인트는 " + cs.bonusPoint + " 입니다.\n");
        }
    }
}
