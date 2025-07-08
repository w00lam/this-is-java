package ch19.quiz.Q3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(50001);
            Socket socket = serverSocket.accept();
        } catch (IOException e) {
        }
    }
}
