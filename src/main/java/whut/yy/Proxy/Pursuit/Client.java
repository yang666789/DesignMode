package whut.yy.Proxy.Pursuit;

public class Client {
    public static void main(String[] args) {
        BeautifulGirl girl = new BeautifulGirl();
        girl.setName("杨颖");

//        IGiveGift daili = new Proxy(girl);
        Proxy daili = new Proxy(girl);
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
