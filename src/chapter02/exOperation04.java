package chapter02;

public class exOperation04 {
    public static void main(String[] args) {
        int fatherAge = 45;
        int motherAge = 47;

        char ch;
//        ch = (fatherAge > motherAge) ? 'T' : 'F';

        if (fatherAge > motherAge) {
            ch = 'T';
        } else {
            ch = 'F';
        }

        System.out.println(ch);
    }
}
