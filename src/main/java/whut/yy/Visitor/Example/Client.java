package whut.yy.Visitor.Example;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new ConcretElementA());
        objectStructure.attach(new ConcretElementB());

        Visitor sing = new ConcretVisitor1();
        Visitor draw = new ConcretVisitor2();

        objectStructure.accept(sing);
        objectStructure.accept(draw);
    }
}
