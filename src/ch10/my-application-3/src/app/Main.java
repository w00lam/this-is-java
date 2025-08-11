package app;

import pack1.A;
import pack2.B;
import pack3.C;

public class Main {
    public static void main(String[] args) {
        //my-module-a 패키지에 포함된 A 클래스 사용
        A a = new A();
        a.method();

        //my-module-a 패키지에 포함된 B 클래스 사용
        B b = new B();
        b.method();

        //my-module-b 패키지에 포함된 C 클래스 사용
        C c = new C();
        c.method();
    }
}
