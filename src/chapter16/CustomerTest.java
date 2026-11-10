package chapter16;

import java.sql.SQLOutput;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer customerKang = new Customer();
//
//        customerKang.customerID = 10010;
//        customerKang.customerName = "강민준";
//        customerKang.bonusPoint = 100;
//
//        System.out.println(customerKang.showCustomerInfo());

        VIPcustomer customerChoi = new VIPcustomer();

        customerChoi.customerID = 10011;
        customerChoi.customerName = "최윤서";
        customerChoi.bonusPoint = 20000;

        System.out.println(customerChoi.showCustomerInfo() + "\n");

        VIPcustomer customerPark = new VIPcustomer(10411, "박지후", 11);
        customerPark.bonusPoint = 22000;

        System.out.println(customerPark.showVIPInfo() + "\n");
    }
}
