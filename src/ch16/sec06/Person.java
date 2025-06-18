package ch16.sec06;

public class Person {
    public Member getMember1(Creatable1 creatable){
        String id="9duck8";
        return creatable.create(id);
    }
    public Member getMember2(Creatable2 creatable){
        String id="9duck8";
        String name="구덕팔";
        return creatable.create(id,name);
    }
}
