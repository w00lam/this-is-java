package ch02;

public class TextBlockExample {
    public static void main(String[] args) {
        String str1 = "" +
                "{\n" +
                "\t\"id\":\"killer\",\n" +
                "\t\"name\":\"파신\"\n" +
                "}";

        String str2 = """
                "id":"killer"
                "name":"파신"
                """;

        System.out.println(str1);
        System.out.println("--------------------------------");
        System.out.println(str2);
        System.out.println("--------------------------------");
        String str = """
                나는 무에타이를 \
                학습합니다.
                나는 무에타이 고수가 될 겁니다.
                """;
        System.out.println(str);
    }
}
