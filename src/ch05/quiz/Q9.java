package ch05.quiz;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int[] scores = null;
        int studentNum = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------------------------");
            System.out.println("1. 학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                System.out.print("학생수> ");
                studentNum = scanner.nextInt();
                scores = new int[studentNum];
            } else if (selectNo == 2) {
                for (int i = 0; i < studentNum; i++) {
                    System.out.print("scores[" + i + "]> ");
                    scores[i] = scanner.nextInt();
                }
            } else if (selectNo == 3) {
                for (int i = 0; i < studentNum; i++) {
                    System.out.print("scores[" + i + "]: " + scores[i]);
                    System.out.println();
                }
            } else if (selectNo == 4) {
                int max = 0;
                int sum = 0;
                for (int score : scores) {
                    sum += score;
                    if (score > max) {
                        max = score;
                    }
                }
                System.out.println("최고 점수: " + max);
                double avg = (double) sum / studentNum;
                System.out.println("평균 점수: " + avg);
            } else if (selectNo == 5) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
    }
}
