package whut.yy.Proxy.Pursuit;

/**
 * 代理类
 */
public class Proxy implements IGiveGift{

    private Pursuit pursuit;

    public Proxy(BeautifulGirl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
