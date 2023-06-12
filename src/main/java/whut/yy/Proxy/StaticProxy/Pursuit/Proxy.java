package whut.yy.Proxy.StaticProxy.Pursuit;

/**
 * 代理类
 */
public class Proxy implements IGiveGift {

    // 引入真实类
    private IGiveGift pursuit;

    public Proxy(BeautifulGirl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void giveFlowers() {
        // 在调用真实对象方法之前增强
        System.out.println("那边的女孩看过来！");
        // 调用真实对象
        pursuit.giveFlowers();
        // 在调用真实对象方法之后增强
        System.out.println("拿着吧！");
    }
}
