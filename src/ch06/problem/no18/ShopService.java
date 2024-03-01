package ch06.problem.no18;

public class ShopService {
    private static final ShopService singleton = new ShopService();

    private ShopService() {
    }

    public ShopService getSingleton() {
        return singleton;
    }
}
