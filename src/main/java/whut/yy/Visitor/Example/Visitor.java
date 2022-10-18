package whut.yy.Visitor.Example;

/**
 * 访问者接口
 * 为 Element下的每个具体类声明一个 Visit操作
 */
public interface Visitor {

    void visitConcreteElementA(ConcretElementA elementA);

    void visitConcreteElementB(ConcretElementB elementB);
}
