package whut.yy.Facade.Fund;

//基金
//需要了解所有股票或者其他投资方式的方法或属性
//进行组合（选择部分方式组合起来），以备外界调用
public class Fund {
    private Stock1 stock1;
    private Stock2 stock2;
    private Stock3 stock3;
    private NationalDebt1 nationalDebt1;
    private Realty1 realty1;

    public Fund() {
        this.stock1 = new Stock1();
        this.stock2 = new Stock2();
        this.stock3 = new Stock3();
        this.nationalDebt1 = new NationalDebt1();
        this.realty1 = new Realty1();
    }

    public void buyFund1() {
        System.out.println("买基金组1() ----");
        stock2.buy();
        nationalDebt1.buy();
        realty1.buy();
    }

    public void sellFund1() {
        System.out.println("卖基金组1() ----");
        stock2.sell();
        nationalDebt1.sell();
        realty1.sell();
    }
}
