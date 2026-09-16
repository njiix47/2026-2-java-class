package chapter05;

public class ExArray03 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int i = 0;

        for (int num = 1; num <= 10; num++) {
            if (num % 2 == 0) {
                arr[i++] = num;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
