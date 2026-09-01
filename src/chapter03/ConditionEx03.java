package chapter03;

public class ConditionEx03 {
    public static void main(String[] args) {
        double distance = 8.5;
        String trans;

        if (distance <= 1) {
            trans = "도보";
        } else if (distance <= 10) {
            trans = "자전거";
        } else if (distance <= 50) {
            trans = "버스";
        } else {
            trans = "기차";
        }

        System.out.println("추천 이동 수단 : " + trans);
    }
}
