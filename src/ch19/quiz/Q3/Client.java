package ch19.quiz.Q3;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 50001);
        } catch (IOException e) {
        }
    }
}
