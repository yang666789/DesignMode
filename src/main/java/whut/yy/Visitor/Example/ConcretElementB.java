package whut.yy.Visitor.Example;

public class ConcretElementB implements Element{
    /**
     * 双分派技术
     * 由访问者对该数据结构进行操作
     * @param visitor：访问者
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
}
