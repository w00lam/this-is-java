package ch05.quiz;

public class Q7 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};

        int max = 0;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("최대값: " + max);
    }
}
