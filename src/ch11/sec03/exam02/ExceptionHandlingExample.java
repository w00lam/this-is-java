package ch11.sec03.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인데스가 초과됨: " + e.getMessage());
            } catch (Exception e) { // 상위 예외 클래스는 아래쪽에 작성
                System.out.println("실행에 문제가 있습니다.");
            }
        }
    }
}
