package Test01;

public class TestEx03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 7; i <= 55;) {
            sum += i;
            i += 3;
        }

        System.out.println("7부터 55까지 3씩 증가하는 수의 합 : " + sum);
    }
}
