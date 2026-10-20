package Test01;

public class TestEx17 {
    public static void main(String[] args) {
        String[] cafeMenu = {"Americono", "CafeLatte", "MilkTea", "IceCream", "GreenTea"};

        cafeMenu[1] = "VanillaLatte";

        for (int i = 0; i < cafeMenu.length; i++) {
            System.out.println(cafeMenu[i]);
        }
    }
}
