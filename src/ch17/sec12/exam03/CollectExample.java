package ch17.sec12.exam03;

import ch17.sec12.exam01.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("구덕팔", "남", 92));
        totalList.add(new Student("팔덕구", "여", 87));
        totalList.add(new Student("김갑수", "남", 95));
        totalList.add(new Student("9duck8", "여", 93));

        Map<String, Double> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getSex,
                                Collectors.averagingDouble(Student::getScore)
                        )
                );

        System.out.println(map);
    }
}
