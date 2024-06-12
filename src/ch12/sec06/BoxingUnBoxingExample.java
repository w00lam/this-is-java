package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        //Boxing
        Integer obj = 100;
        System.out.println(STR."value: \{obj.intValue()}");

        //Unboxing
        int value = obj;
        System.out.println(STR."value: \{value}");

        //연산 시 Unboxing
        int result = obj + 100;
        System.out.println(STR."result: \{result}");
    }
}
