package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<String> list = new ArrayList<>();
        list.add("구덕팔");
        list.add("팔덕구");
        list.add("김갑수");
        list.add("팔덕구");
        list.add("팔갑수");

        //중복 요소 제거
        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        //팔로 시작하는 요소만 필터링
        list.stream()
                .filter(n -> n.startsWith("팔"))
                .forEach(System.out::println);
        System.out.println();

        //중복 요소를 먼저 제거하고, 팔로 시작하는 요소만 필터링
        list.stream()
                .distinct()
                .filter(n -> n.startsWith("팔"))
                .forEach(System.out::println);
    }
}
