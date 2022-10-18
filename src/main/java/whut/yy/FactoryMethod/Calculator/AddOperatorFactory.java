package whut.yy.FactoryMethod.Calculator;

public class AddOperatorFactory implements OperatorFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
