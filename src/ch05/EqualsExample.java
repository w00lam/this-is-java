package ch05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "정진만";
        String strVar2 = "정진만";

        if (strVar1 == strVar2) {
            System.out.println("strVal1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVal1과 strVar2는 참조가 다름");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("strVal1과 strVal2는 문자열이 같음");
        }

        String strVar3 = new String("정진만");
        String strVar4 = new String("정진만");

        if (strVar3 == strVar4) {
            System.out.println("strVal3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVal3과 strVar4는 참조가 다름");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("strVal3과 strVal4는 문자열이 같음");
        }
    }
}
