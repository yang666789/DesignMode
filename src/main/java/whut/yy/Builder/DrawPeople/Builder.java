package whut.yy.Builder.DrawPeople;

//稳定构造
public abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();//得到产品创建后结果
}
