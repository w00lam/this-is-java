package ch17.quiz.Q7;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("구덕팔", "개발자"),
                new Member("팔덕구", "디자이너"),
                new Member("김갑수", "개발자")
        );

        List<Member> developers = list.stream()
                .filter(m -> m.getJob().equals("개발자"))
                .toList();
        developers
                .stream()
                .forEach(m -> System.out.println(m.getName()));
    }
}
