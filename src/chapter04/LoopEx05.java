package chapter04;

public class LoopEx05 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                num += 1;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
