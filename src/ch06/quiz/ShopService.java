package ch06.quiz;

import ch06.sec15.Singleton;

public class ShopService {
    private static ShopService shopService = new ShopService();

    private ShopService(){
    }

    public static ShopService getInstance() {
        return shopService;
    }
}
