package ch12.quiz.Q11;

import java.util.StringTokenizer;

public class Example {
    public static void main(String[] args) {
        String str = "아이디,이름,패스워드";
        StringTokenizer st = new StringTokenizer(str, ",");

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
