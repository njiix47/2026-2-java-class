package chapter03;

public class ConditionEx05 {
    public static void main(String[] args) {
        double ration = 8.6;

        if (ration >= 9) {
            System.out.println("강력 추천합니다.");
        } else if (ration >= 8) {
            System.out.println("추천합니다.");
        } else if (ration >= 7) {
            System.out.println("볼 만합니다.");
        } else {
            System.out.println("추천하지 않습니다.");
        }
    }
}
