package whut.yy.Iterator.BuyTicket;

public interface Iterator {
    Object first();
    Object next();
    boolean isDone();
    Object currentItem();
}
