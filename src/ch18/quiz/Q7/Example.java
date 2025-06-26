package ch18.quiz.Q7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "C:/Users/wlam1/IdeaProjects/this-is-java/src/ch02/sec01/VariableUseExample.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while (true) {
            rowNumber++;
            rowData = br.readLine();
            if (rowData == null) {
                break;
            }
            System.out.println(rowNumber + " : " + rowData);
        }

        br.close();
        fr.close();
    }
}
