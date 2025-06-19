package ch17.sec12.exam01;

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

        //남학생만  묶어 List 생성
        /*List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .collect(Collectors.toList());*/

        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        //학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                Student::getName,   //Student 객체에서 키가 될 부분 리턴
                                Student::getScore   //Student 객체에서 값이 될 부분 리턴
                        )
                );

        System.out.println(map);
    }
}
