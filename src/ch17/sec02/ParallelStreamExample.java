package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<String> list = new ArrayList<>();
        list.add("구덕팔");
        list.add("팔덕구");
        list.add("김갑수");
        list.add("9duck8");
        list.add("8duck9");

        //병렬 처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(name -> {
            System.out.println(name + ": " + Thread.currentThread().getName());
        });
    }
}
