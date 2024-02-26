package ch05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        String sex = switch (ssn.charAt(6)) {
            case '1':
            case '3':
                yield "남자";
            case '2':
            case '4':
                yield "여자";
            default:
                throw new IllegalStateException("Unexpected value: " + ssn.charAt(6));
        };
        System.out.println(sex + "입니다.");
    }
}
