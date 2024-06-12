package ch12.sec03.exam04;

public class MemberExample {
    public static void main(String[] args) {
        Member m = new Member("winter", "김민정", 24);
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m.toString());
        System.out.println();

        Member m1 = new Member("winter", "김민정", 24);
        Member m2 = new Member("winter", "김민정", 24);
        System.out.println(STR."m1.hashCode(): \{m1.hashCode()}");
        System.out.println(STR."m2.hashCode(): \{m2.hashCode()}");
        System.out.println(STR."m2.equals(m2): \{m1.equals(m2)}");
    }
}
