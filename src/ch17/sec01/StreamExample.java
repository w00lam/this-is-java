package ch17.sec01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //Set 컬렉션 생성
        Set<String> set = new HashSet<>();
        set.add("구덕팔");
        set.add("팔덕구");
        set.add("김갑수");

        //Stream을 이용한 요소 반복 처리
        Stream<String> stream = set.stream();
        stream.forEach(System.out::println);
    }
}
