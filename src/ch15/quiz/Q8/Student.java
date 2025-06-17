package ch15.quiz.Q8;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student target) {
            return target.studentNum == studentNum;
        } else {
            return false;
        }
    }
}
