package Test01;

public class TestEx19 {
    public static void main(String[] args) {
        char[] alpha = new char[26];
        char z = 'z';

        for (int i = 0; i < alpha.length; i++) {
             z = z--;
            System.out.print(alpha[i]);
        }
    }
}
