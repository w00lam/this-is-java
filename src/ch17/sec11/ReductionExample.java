package ch17.sec11;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("구덕팔", 92),
                new Student("팔덕구", 95),
                new Student("김갑수", 88)
        );
        //방법1
        int sum1 = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();
        //방법2
        int sum2 = studentList.stream()
                .map(Student::getScore)
                .reduce(0, Integer::sum);

        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
    }
}
