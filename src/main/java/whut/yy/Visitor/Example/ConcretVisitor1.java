package whut.yy.Visitor.Example;

public class ConcretVisitor1 implements Visitor {
    /**
     * 由访问者内方法分别访问不同的稳定数据结构
     * 函数体内为具体操作，使得操作和数据结构低耦合
     * @param elementA
     */
    @Override
    public void visitConcreteElementA(ConcretElementA elementA) {
        System.out.println(elementA.getClass().getName() + "被" + this.getClass().getName() + "访问");
    }

    @Override
    public void visitConcreteElementB(ConcretElementB elementB) {
        System.out.println(elementB.getClass().getName() + "被" + this.getClass().getName() + "访问");
    }
}
