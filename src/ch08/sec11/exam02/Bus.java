package ch08.sec11.exam02;

public class Bus implements Vehicle {
    //추상 메소드 재저으이
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
