package chapter03;

public class ConditionEx09 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;
        char op = '+';

//        System.out.println(num1 +  + num2 + (num1 + num2));

        switch (op) {
            case '+' -> System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
            case '-' -> System.out.printf("%d - %d = %d", num1, num2, (num1 - num2));
            case '*' -> System.out.printf("%d * %d = %d", num1, num2, (num1 * num2));
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다");
                } else {
                    System.out.printf("%d / %d = %d", num1, num2, (num1 / num2));
                }
            }
            default -> System.out.println("잘못된 연산자입니다.");
        }
    }
}
