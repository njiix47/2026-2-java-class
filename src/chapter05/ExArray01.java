package chapter05;

public class ExArray01 {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30, 40};

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %s \n", i, arr[i]);
        }
    }
}
