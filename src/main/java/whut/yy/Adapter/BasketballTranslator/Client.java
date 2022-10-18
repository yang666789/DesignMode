package whut.yy.Adapter.BasketballTranslator;

public class Client {
    public static void main(String[] args) {
        Player a = new Forwards("巴蒂尔");
        a.attack();

        Player b = new Guards("麦克格雷迪");
        b.defense();

        Player yaoMing = new Translator("姚明");
        yaoMing.attack();
        yaoMing.defense();

    }
}
