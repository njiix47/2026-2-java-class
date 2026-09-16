package chapter05;

public class ExArray02 {
    public static void main(String[] args) {
        char[] arr = new char[10];
        char alpha = 'A';

        for (int i = 0; i < arr.length; i++) {
            arr[i] = alpha++;
            System.out.print(arr[i]);
        }


    }
}
