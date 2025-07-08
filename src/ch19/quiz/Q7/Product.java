package ch19.quiz.Q7;

public class Product {
    private int no;
    private String name;
    private int price;
    private int stock;

    public Product() {
    }

    public Product(int no, String name, int price, int stock) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
