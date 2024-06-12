package ch12.sec11.exam02;

import lombok.Getter;
import lombok.Setter;

public class Car {
    //메소드
    //필드
    @Getter
    @Setter
    private String model;
    @Getter
    @Setter
    private String owner;

    //생성자
    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }


}
