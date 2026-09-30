package chapter10;

public class PhoneStoreTest {
    public static void main(String[] args) {
        Phone phone = new Phone("iPhone 18 pro", 1990000);
        Store store = new Store(phone);
        Customer customer = new Customer("장준우", 20000000, "iPhone 18 pro");

        customer.buyPhone(store);
    }
}
