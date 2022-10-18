package whut.yy.Iterator.BuyTicket;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add(0, "大鸟");
        aggregate.add(1, "小菜");
        aggregate.add(2, "行李");
        aggregate.add(3, "老外");
        aggregate.add(4, "公交内部员工");
        aggregate.add(5, "小偷");

//        Iterator iterator = new ConcreteIterator(aggregate);
        Iterator iterator = aggregate.creatIterator();
        Object item = iterator.first();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem()+" 请买车票");
            iterator.next();
        }
    }
}
