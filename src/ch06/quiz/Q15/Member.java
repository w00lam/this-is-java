package ch06.quiz.Q15;

public class Member {
    String name;
    String id;
    String password;
    int age;

    Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    boolean login(String id, String password) {
        return id.equals("hong") && password.equals("12345");
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되셨습니다.");
    }
}
