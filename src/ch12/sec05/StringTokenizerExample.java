package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "구덕팔&팔덕구,김갑수";
        String[] arr = data1.split("[&,]");
        for (String token : arr) {
            System.out.println(token);
        }
        System.out.println();

        String data2 = "구덕팔/팔덕구/김갑수";
        StringTokenizer st = new StringTokenizer(data2, "/");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
