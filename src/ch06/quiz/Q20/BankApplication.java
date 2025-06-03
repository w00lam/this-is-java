package ch06.quiz.Q20;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accounts = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("--------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                getAccounts();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                break;
            } else {
                System.out.println("알수없는 명령어입니다.");
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void createAccount() {
        System.out.println("-----------");
        System.out.println("계좌생성");
        System.out.println("-----------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("계좌주: ");
        String owner = scanner.next();
        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();

        Account findAccount = findAno(ano);
        if (findAccount != null) {
            System.out.println("결과: 이미 등록된 계좌번호입니다.");
        } else if (isBalance(balance)) {
            System.out.println("결과: 0이상의 금액을 입력해주세요.");
        } else {
            Account newAccount = new Account(ano, owner, balance);
            for (int i = 0; i < accounts.length; i++) {
                if (accounts[i] == null) {
                    accounts[i] = newAccount;
                    break;
                }
            }
            System.out.println("결과: 계좌가 생성되었습니다.");
        }
    }

    private static void getAccounts() {
        System.out.println("-----------");
        System.out.println("계좌목록");
        System.out.println("-----------");
        for (Account account : accounts) {
            if (account == null) {
                break;
            } else {
                System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
            }
        }
    }

    private static void deposit() {
        System.out.println("-----------");
        System.out.println("예금");
        System.out.println("-----------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int balance = scanner.nextInt();

        Account account = findAno(ano);

        if (account == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
        } else {
            account.setBalance(account.getBalance() + balance);
            System.out.println("결과: 예금 성공.");
        }
    }

    private static void withdraw() {
        System.out.println("-----------");
        System.out.println("출금");
        System.out.println("-----------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("출금액: ");
        int balance = scanner.nextInt();

        Account account = findAno(ano);

        if (account == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
        } else if ((account.getBalance() - balance) < 0) {
            System.out.println("결과: 잔고가 부족합니다.(현재 잔고: " + account.getBalance() + "원)");
        } else {
            account.setBalance(account.getBalance() - balance);
            System.out.println("결과: 출금이 성공되었습니다.");
        }
    }

    private static Account findAno(String ano) {
        for (Account account : accounts) {
            if (account != null) {
                if (account.getAno().equals(ano)) {
                    return account;
                }
            }
        }
        return null;
    }

    private static boolean isBalance(int balance) {
        return balance < 0;
    }
}