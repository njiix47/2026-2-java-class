package chapter05;

public class ExArray07 {
    public static void main(String[] args) {
        char[] alpha1 = new char[13];
        char[] alpha2 = new char[13];
        char[] alpha = new char[26];

        char alpha3 = 'A';

        for (int i  = 0; i < alpha1.length; ++i) {
            alpha1[i] = alpha3++;
        }

        for (int i  = 0; i < alpha2.length; i++) {
            alpha2[i] = alpha3++;
        }

        System.arraycopy(alpha1, 0, alpha, 0, alpha1.length);
        System.arraycopy(alpha2, 0, alpha, alpha1.length, alpha2.length);

        for (int i = 0; i < alpha.length; ++i) {
            System.out.print(alpha[i]);
        }
    }
}
