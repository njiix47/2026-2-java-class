package chapter17.customer;

public class GOLDcustomer extends Customer {
    double saleRatio;

    public GOLDcustomer() {
        initGOLDCustomer();
    }

    public GOLDcustomer(int customerID, String customerName) {
            super(customerID, customerName);
            initGOLDCustomer();
    }

    private void initGOLDCustomer() {
        saleRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += (int)(price * bonusRatio);
        return price - (int)(price * saleRatio);
    }

    public String showGOLDInfo() {
        return showCustomerInfo();
    }
}
