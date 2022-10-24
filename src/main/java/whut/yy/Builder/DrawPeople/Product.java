package whut.yy.Builder.DrawPeople;

import java.util.ArrayList;
import java.util.List;

//具体产品
public class Product {
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        this.parts.add(part);
    }

    public void show() {
        System.out.println("产品 创建 -----");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
