package ch17.quiz.Q6;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("구덕팔", 30),
                new Member("팔덕구", 40),
                new Member("김갑수", 26)
        );

        double avg = list.stream()
                //-----------------------
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
                //-----------------------
        System.out.println("평균 나이: " + avg);
    }
}
