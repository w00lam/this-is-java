package ch13.sec05;

public class GenericExample {
    public static void main(String[] args) {
        //모든 사람이 신청 가능
        Course.registerCourse1(new Applicant<>(new Person()));
        Course.registerCourse1(new Applicant<>(new Worker()));
        Course.registerCourse1(new Applicant<>(new Student()));
        Course.registerCourse1(new Applicant<>(new HighStudent()));
        Course.registerCourse1(new Applicant<>(new MiddleStudent()));
        System.out.println();

        //학생만 신청 가능
        //Course.registerCourse2(new Applicant<>(new Person()));    (x)
        //Course.registerCourse2(new Applicant<>(new Worker()));    (x)
        Course.registerCourse2(new Applicant<>(new Student()));
        Course.registerCourse2(new Applicant<>(new HighStudent()));
        Course.registerCourse2(new Applicant<>(new MiddleStudent()));
        System.out.println();

        //직장인 및 일반인만 신청 가능
        //모든 사람이 신청 가능
        Course.registerCourse3(new Applicant<>(new Person()));
        Course.registerCourse3(new Applicant<>(new Worker()));
        //Course.registerCourse1(new Applicant<>(new Student()));       (x)
        //Course.registerCourse1(new Applicant<>(new HighStudent()));   (x)
        //Course.registerCourse1(new Applicant<>(new MiddleStudent())); (x)
    }
}
