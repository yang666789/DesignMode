package whut.yy.Proxy.StaticProxy.Pursuit;

public class Client {
    public static void main(String[] args) {
        // 非重点对象，可忽略
        BeautifulGirl girl = new BeautifulGirl();
        girl.setName("杨颖");

        IGiveGift daili = new Proxy(girl);
        daili.giveFlowers();
    }
}
