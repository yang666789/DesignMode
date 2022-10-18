package whut.yy.Iterator.BuyTicket;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator creatIterator() {
        return new ConcreteIterator(this);
    }

    //返回聚集总个数
    public int count() {
        return items.size();
    }

    //插入
    public void add(int index, Object item) {
        items.add(index, item);
    }

    //获取
    public Object get(int index) {
        return items.get(index);
    }
}
