package ch17.quiz.Q8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("구덕팔", "개발자"),
                new Member("팔덕구", "디자이너"),
                new Member("김갑수", "개발자")
        );

        Map<String, List<Member>> groupingMap = list.stream()
                //----------------------------------------------
                .collect(Collectors.groupingBy(Member::getJob));
                //----------------------------------------------

        System.out.println("[개발자]");
        //------------------------------------
        groupingMap.get("개발자").stream()
                .forEach(System.out::println);
        //------------------------------------
        System.out.println();

        System.out.println("[디자이너]");
        //------------------------------------
        groupingMap.get("디자이너").stream()
                .forEach(System.out::println);
        //------------------------------------
    }
}
