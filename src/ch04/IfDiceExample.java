package ch04;

public class IfDiceExample {
    public static void main(String[] args) {
        //start부터 시작하는 n개의 정수 중에서 하나의 정수 얻기
        //int num = (int) (Math.random() * n) + start;
        int num = (int) (Math.random() * 6) + 1;

        if (num == 1) {
            System.out.println("1번이 나왔습니다.");
        } else if (num == 2) {
            System.out.println("2번이 나왔습니다.");
        } else if (num == 3) {
            System.out.println("3번이 나왔습니다.");
        } else if (num == 4) {
            System.out.println("4번이 나왔습니다.");
        } else if (num == 5) {
            System.out.println("5번이 나왔습니다.");
        } else {
            System.out.println("6번이 나왔습니다.");
        }
    }
}
