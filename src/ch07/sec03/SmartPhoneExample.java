package ch07.sec03;

public class SmartPhoneExample {
    public void main(String[] args){
        //SmartPhone 객체 생성
        SmartPhone myPhone=new SmartPhone("갤럭시","은색");

        //Phone으로부터 상속 받은 필드 읽기
        System.out.println(STR."모델: \{myPhone.model}");
        System.out.println(STR."색상: \{myPhone.color}");
    }
}
