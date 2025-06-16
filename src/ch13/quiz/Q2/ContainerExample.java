package ch13.quiz.Q2;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.setT("팔덕구");
        String str = container1.getT();

        Container<Integer> container2 = new Container<>();
        container2.setT(5);
        int value = container2.getT();
    }
}
