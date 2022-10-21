package whut.yy.Proxy.Pursuit;

/**
 * 真实类
 */
public class Pursuit implements IGiveGift{

    private BeautifulGirl girl;

    public Pursuit(BeautifulGirl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println("给"+girl.getName()+"送芭比娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println("给"+girl.getName()+"送鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println("给"+girl.getName()+"送巧克力");
    }
}
