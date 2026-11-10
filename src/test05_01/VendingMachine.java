package test05_01;

public class VendingMachine {
    private String name;
    private int price;
    private int stock;

    public VendingMachine(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void sell(int count) {
        if (count > 0 && count <= stock) {
            stock -= count;
        } else {
            System.out.println("음료를 판매할 수 없습니다.");
        }
    }

    public void showInfo() {
        System.out.println("음료 이름 : " + name);
        System.out.println("가격 : " + price);
        System.out.println("남은 재고 : " + stock);
    }
}
