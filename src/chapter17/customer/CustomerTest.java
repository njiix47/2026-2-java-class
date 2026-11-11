package chapter17.customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer(10013, "석하랑");
        System.out.println(customer1.showCustomerInfo());

        Customer customer2 = new VIPcustomer(10014, "정재한", 14);
        System.out.println(customer2.showCustomerInfo());

        System.out.println("\n할인율 및 포인트\n");

        int price = 40000;
        int cus1Price = customer1.calcPrice(price);
        int cus2Price = customer1.calcPrice(price);

        System.out.println(customer1.customerName + "님이 " + cus1Price + "원을 지불하셨습니다.");

        System.out.println(customer1.showCustomerInfo());

    }
}
