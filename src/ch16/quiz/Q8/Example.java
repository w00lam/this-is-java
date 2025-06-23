package ch16.quiz.Q8;

public class Example {
    private static Student[] students = {
            new Student("구덕팔", 90, 96),
            new Student("팔덕구", 95, 93)
    };

    public static double avg(Function<Student> function) {
        int sum = 0;
        for (Student student : students) {
            sum += function.apply(student);
        }
        return (double) sum / students.length;
    }

    public static void main(String[] args) {
        double englishAvg = avg(s -> s.getEnglishScore());
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("수학 평균 점수: " + mathAvg);
    }
}
