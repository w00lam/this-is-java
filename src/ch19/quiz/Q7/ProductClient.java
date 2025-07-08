package ch19.quiz.Q7;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ProductClient {
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    Scanner scanner = new Scanner(System.in);

    public void connect() throws IOException {
        socket = new Socket("localhost", 50001);
        dis = new DataInputStream(socket.getInputStream());
        dos = new DataOutputStream(socket.getOutputStream());
        list();
    }

    public void menu() throws IOException {
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("메뉴: 1.Create | 2.Update | 3.Delete | 4.Exit");
        System.out.print("선택: ");
        int menu = scanner.nextInt();
        switch (menu) {
            case 1 -> create();
            case 2 -> update();
            case 3 -> delete();
            case 4 -> unconnect();
        }
    }

    public void list() throws IOException {
        System.out.println("[상품 목록]");
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-6s%-30s%-15s%-10s\n", "no", "name", "price", "stock");
        System.out.println("----------------------------------------------------------");
        JSONObject request = new JSONObject();
        request.put("menu", 0);
        request.put("data", new JSONObject());
        dos.writeUTF(request.toString());
        dos.flush();

        JSONObject response = new JSONObject(dis.readUTF());
        if (response.getString("status").equals("success")) {
            JSONArray data = response.getJSONArray("data");
            for (int i = 0; i < data.length(); i++) {
                JSONObject product = data.getJSONObject(i);
                System.out.printf("%-6d%-30s%-15d%-10d\n",
                        product.getInt("no"),
                        product.getString("name"),
                        product.getInt("price"),
                        product.getInt("stock"));
            }
        }
        menu();
    }

    public void create() throws IOException {
        System.out.println("[상품 생성]");
        Product product = new Product();
        System.out.print("상품 이름: ");
        product.setName(scanner.next());
        System.out.print("상품 가격: ");
        product.setPrice(scanner.nextInt());
        System.out.print("상품 재고: ");
        product.setStock(scanner.nextInt());

        JSONObject data = new JSONObject();
        data.put("name", product.getName());
        data.put("price", product.getPrice());
        data.put("stock", product.getStock());

        JSONObject request = new JSONObject();
        request.put("menu", 1);
        request.put("data", data);
        dos.writeUTF(request.toString());
        dos.flush();

        JSONObject response = new JSONObject(dis.readUTF());
        if (response.getString("status").equals("success")) list();
    }

    public void update() throws IOException {
        System.out.println();
        System.out.println("[상품 수정]");
        System.out.print("상품 번호: ");
        int no = scanner.nextInt();
        System.out.print("이름 변경: ");
        String name = scanner.next();
        System.out.print("가격 변경: ");
        int price = scanner.nextInt();
        System.out.print("재고 변경: ");
        int stock = scanner.nextInt();
        Product product = new Product(no, name, price, stock);

        JSONObject data = new JSONObject();
        data.put("no", product.getNo());
        data.put("name", product.getName());
        data.put("price", product.getPrice());
        data.put("stock", product.getStock());

        JSONObject request = new JSONObject();
        request.put("menu", 2);
        request.put("data", data);
        dos.writeUTF(request.toString());
        dos.flush();

        JSONObject response = new JSONObject(dis.readUTF());
        if (response.getString("status").equals("success")) list();
    }

    public void delete() throws IOException {
        System.out.println();
        System.out.println("[상품 삭제]");
        System.out.print("상품 번호: ");
        int no = scanner.nextInt();

        JSONObject data = new JSONObject();
        data.put("no", no);

        JSONObject request = new JSONObject();
        request.put("menu", 3);
        request.put("data", data);
        dos.writeUTF(request.toString());
        dos.flush();

        JSONObject response = new JSONObject(dis.readUTF());
        if (response.getString("status").equals("success")) list();
    }

    public void unconnect() {
        try {
            socket.close();
            scanner.close();
        } catch (Exception e) {
            System.out.print("[클라이언트] 종료됨");
        }
    }

    public static void main(String[] args) {
        ProductClient productClient = new ProductClient();
        try {
            productClient.connect();
        } catch (IOException e) {
            System.out.print(e.getMessage());
            productClient.unconnect();
        }
    }
}
