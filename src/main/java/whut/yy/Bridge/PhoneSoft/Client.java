package whut.yy.Bridge.PhoneSoft;

public class Client {
    public static void main(String[] args) {
        HandsetBrand brand;

        System.out.println("手机品牌A：");
        brand = new HandsetBrandA();
        brand.setSoft(new HandsetGame());
        brand.run();
        brand.setSoft(new HandsetAddressList());
        brand.run();

        System.out.println("手机品牌B：");
        brand = new HandsetBrandB();
        brand.setSoft(new HandsetGame());
        brand.run();
        brand.setSoft(new HandsetAddressList());
        brand.run();
    }
}
