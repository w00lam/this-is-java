package ch04.quiz.Q7;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");
            String banking = scanner.nextLine();

            if (banking.equals("1")) {
                System.out.print("예금액> ");
                String bankingDep = scanner.nextLine();
                int depAmount = Integer.parseInt(bankingDep);
                balance += depAmount;
            } else if (banking.equals("2")) {
                System.out.print("출금액> ");
                String bankingWD = scanner.nextLine();
                int wdAmount = Integer.parseInt(bankingWD);
                if ((balance - wdAmount) >= 0) {
                    balance -= wdAmount;
                } else {
                    System.out.println("잔고가 부족합니다.");
                }
            } else if (banking.equals("3")) {
                System.out.println("잔고> " + balance);
            } else if (banking.equals("4")) {
                System.out.println();
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
    }
}
