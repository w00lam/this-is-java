package ch05.quiz;

public class Q8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int totalNum = 0;
        int totalSum = 0;
        for (int[] num : array) {
            totalNum += num.length;
            for (int n : num) {
                totalSum += n;
            }
        }
        double totalAvg = (double) totalSum / totalNum;
        System.out.println("전체 합: " + totalSum);
        System.out.println("전체 평균: " + totalAvg);
    }
}
