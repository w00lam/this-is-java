package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("구덕팔", 85));
        studentList.add(new Student("구덕팔", 92));
        studentList.add(new Student("구덕팔", 87));

        //Student를 score 스트림으로 변환
        studentList.stream()
                .mapToInt(Student::getScore)
                .forEach(System.out::println);
    }
}
