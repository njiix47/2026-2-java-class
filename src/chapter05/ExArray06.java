package chapter05;

public class ExArray06 {
    public static void main(String[] args) {
        int[][] score = new int[][] {
                {89, 76, 100, 68, 48, 98, 56, 77, 95},
                {50, 60, 70, 100, 99, 88, 83, 78, 93}
        };

        int aSum = 0;
        int bSum = 0;

        for (int i = 0; i < score.length; ++i) {
            for (int j = 0; j < score[i].length; ++j) {
                if (i == 0) {
                    aSum += score[i][j];
                } else {
                    bSum += score[i][j];
                }
            }
        }

        double aAvg = (double)aSum / score[0].length;
        double bAvg = (double)bSum / score[1].length;

        System.out.printf("A반 평균: %.1f \nB반 평균: %.1f", aAvg, bAvg);
    }
}
