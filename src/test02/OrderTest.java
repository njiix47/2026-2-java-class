package test02;

public class OrderTest {
    public static void main(String[] args) {
        Order order01 = new Order();

        order01.orderID = 202609013L;
        order01.customerID = "dgsw";
        order01.orderDate = "2026년 09월 01일";
        order01.customerName = "홍길동";
        order01.productID = "PD0345-12";
        order01.address = "대구광역시 달성군 구지면 창리로 93";

        System.out.println("주문 번호 : " + order01.orderID);
        System.out.println("주문자 아이디 : " + order01.orderID);
        System.out.println("주문 날짜 : " + order01.orderID);
        System.out.println("주문자 이름 : " + order01.orderID);
        System.out.println("주문 상품 번호 : " + order01.orderID);
        System.out.println("배송 주소 : " + order01.orderID);
    }
}

