package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        //Phone phone = new Phone(); 추상 클래스는 new 연산자를 이용해서 객를르 직접 만들지 못 함.

        SmartPhone smartPhone = new SmartPhone("오너");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
