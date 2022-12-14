package whut.yy.Builder.DrawPeople;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.construct(b1);//由指挥者指挥具体建造者如何建造
        Product p1 = b1.getResult();//具体建造者产生的产品
        p1.show();

        director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }
}
