package chapter17.customer;

public class VIPcustomer extends Customer {
    private int agentID; // 담당 상담원 아이디
    double saleRatio; // 할인율

    public VIPcustomer() {
//        super(); // 부모 클래스의 생성자가 매개변수 생성자만 있는 경우 필수적으로 작성해 주어야함

        initVIPCustomer();
    }

    public VIPcustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);

        this.agentID = agentID;
        initVIPCustomer();
    }

    private void initVIPCustomer() {
        saleRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += (int)(price * bonusRatio);
        return price - (int)(price * saleRatio);
    }

    public String showVIPInfo() {
        return showCustomerInfo() + " 담당 상담원 아이디는 " + agentID + "입니다.";
    }
}
