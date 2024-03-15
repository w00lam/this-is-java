package ch07.sec03;

public class SmartPhone extends Phone {
    //자식 생성자 선언
    public SmartPhone(String model, String color) {
        super(model, color); // 부모 클래스에 기본 생성자가 있을 경우 생략 가능
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
