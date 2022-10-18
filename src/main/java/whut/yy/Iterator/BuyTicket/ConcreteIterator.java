package whut.yy.Iterator.BuyTicket;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor()//在需要的字段上加上final
public class ConcreteIterator implements Iterator {
    private final ConcreteAggregate aggregate;
    private int index = 0;

    @Override
    public Object first() {
        return aggregate.get(0);
    }

    @Override
    public Object next() {
        Object item = null;
        index++;
        if (index < aggregate.count()) {
            item = aggregate.get(index);
        }
        return item;
    }

    @Override
    public boolean isDone() {
        return index >= aggregate.count();
    }

    @Override
    public Object currentItem() {
        return aggregate.get(index);
    }
}
