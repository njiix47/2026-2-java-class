package Test01;

public class TestEx02 {
    public static void main(String[] args) {
        int score = 86;
        System.out.println("점수 : " + score);

        String level = switch (score / 10) {
            case 10, 9 -> "등급 : A";
            case 8 -> "등급 : B";
            case 7 -> "등급 : C";
            default -> "등급 : D";
        };

        System.out.println(level);
    }
}
