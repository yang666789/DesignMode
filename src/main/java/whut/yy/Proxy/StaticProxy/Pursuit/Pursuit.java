package whut.yy.Proxy.StaticProxy.Pursuit;

/**
 * 真实类，即被代理对象
 */
public class Pursuit implements IGiveGift {

    private BeautifulGirl girl;

    public Pursuit(BeautifulGirl girl) {
        this.girl = girl;
    }

    @Override
    public void giveFlowers() {
        System.out.println("给" + girl.getName() + "送鲜花");
    }
}
