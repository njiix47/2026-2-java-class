package chapter16;

public class CustomerTest02 {
    public static void main(String[] args) {
        Customer cs = new VIPcustomer();
//      VIPcustomer vipCs = new Customer(); -> 상위 클래스에서 하위 클래스로 묵시적 형변환은 불가능!!

        Customer vc = new VIPcustomer(10030, "장준우", 12);
        vc.bonusPoint = 1000;

        System.out.println(vc.customerName + "님이 지불하실 금액은 " + vc.calcPrice(1000) + "원입니다.");


    }
}
