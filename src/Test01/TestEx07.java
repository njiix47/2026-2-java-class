package Test01;

public class TestEx07 {
    public static void main(String[] args) {
        int[] numbers = {13, 66, 34, 83, 41, 92, 23, 76};
        int maxNum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                if (numbers[i] >= maxNum) {
                    maxNum = numbers[i];
                }
            }
        }

        System.out.println("짝수 중 가장 큰 값 : " + maxNum);
    }
}
