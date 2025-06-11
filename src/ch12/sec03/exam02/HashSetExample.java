package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<>();

        Student s1 = new Student(1, "구덕팔");
        hashSet.add(s1);
        System.out.println("저장된 객체 수: " + hashSet.size());

        /**
         * 재정의된 hashCode()에 의해 s2와 s3는 동등 객체임.
         * hashCode()를 재정의하지 않으면 객체 번지로 해시 코드를 생성하므로 동등 객체가 아님.
         */
        Student s2 = new Student(1, "구덕팔");
        hashSet.add(s2);
        System.out.println("저장된 객체 수: " + hashSet.size());

        Student s3=new Student(2,"구덕팔");
        hashSet.add(s3);
        System.out.println("저장된 객체 수: "+hashSet.size());
    }
}
