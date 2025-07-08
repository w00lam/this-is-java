package ch19.quiz.Q7;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProductServer {
    ServerSocket serverSocket;
    ExecutorService threadPool = Executors.newFixedThreadPool(100);
    List<Product> products = new Vector<>();
    int sequence = 0;

    public void start() throws IOException {
        serverSocket = new ServerSocket(50001);
        System.out.println("[서버] 시작됨");

        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    Socket socket = serverSocket.accept();
                    SocketClient sc = new SocketClient(socket);
                }
            } catch (IOException e) {
            }
        });
        thread.start();
    }

    public void stop() {
        try {
            serverSocket.close();
            threadPool.shutdownNow();
            System.out.println("[서버] 종료됨 ");
        } catch (IOException e1) {
        }
    }

    public class SocketClient {
        Socket socket;
        DataInputStream dis;
        DataOutputStream dos;

        public SocketClient(Socket socket) {
            try {
                this.socket = socket;
                this.dis = new DataInputStream(socket.getInputStream());
                this.dos = new DataOutputStream(socket.getOutputStream());
                receive();
            } catch (IOException e) {
            }
        }

        public void receive() {
            threadPool.execute(() -> {
                try {
                    while (true) {
                        String receiveJson = dis.readUTF();
                        JSONObject request = new JSONObject(receiveJson);
                        int menu = request.getInt("menu");
                        switch (menu) {
                            case 0 -> list(request);
                            case 1 -> create(request);
                            case 2 -> update(request);
                            case 3 -> delete(request);
                        }
                    }
                } catch (IOException e) {
                    close();
                }
            });
        }

        public void list(JSONObject request) throws IOException {
            JSONArray data = new JSONArray();

            for (Product p : products) {
                JSONObject product = new JSONObject();
                product.put("no", p.getNo());
                product.put("name", p.getName());
                product.put("price", p.getPrice());
                product.put("stock", p.getStock());
                data.put(product);
            }

            JSONObject response = new JSONObject();
            response.put("status", "success");
            response.put("data", data);
            dos.writeUTF(response.toString());
            dos.flush();
        }

        public void create(JSONObject request) throws IOException {
            JSONObject data = request.getJSONObject("data");
            String name = data.getString("name");
            int price = data.getInt("price");
            int stock = data.getInt("stock");

            Product product = new Product(++sequence, name, price, stock);
            products.add(product);

            JSONObject response = new JSONObject();
            response.put("status", "success");
            response.put("data", new JSONObject());
            dos.writeUTF(response.toString());
            dos.flush();
        }

        public void update(JSONObject request) throws IOException {
            JSONObject data = request.getJSONObject("data");
            int no = data.getInt("no");

            for (Product product : products) {
                if (product.getNo() == no) {
                    product.setName(data.getString("name"));
                    product.setPrice(data.getInt("price"));
                    product.setStock(data.getInt("stock"));
                }
            }

            JSONObject response = new JSONObject();
            response.put("status", "success");
            response.put("data", new JSONObject());
            dos.writeUTF(response.toString());
            dos.flush();
        }

        public void delete(JSONObject request) throws IOException {
            JSONObject data = request.getJSONObject("data");
            int no = data.getInt("no");
            Iterator<Product> iterator = products.iterator();

            while (iterator.hasNext()) {
                Product product = iterator.next();
                if (product.getNo() == no) {
                    iterator.remove();
                }
            }

            JSONObject response = new JSONObject();
            response.put("status", "success");
            response.put("data", new JSONObject());
            dos.writeUTF(response.toString());
            dos.flush();
        }

        public void close() {
            try {
                socket.close();
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        ProductServer productServer = new ProductServer();
        try {
            productServer.start();
        } catch (IOException e) {
            System.out.println("[서버] " + e.getMessage());
            productServer.stop();
        }
    }
}
