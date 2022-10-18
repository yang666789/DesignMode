package whut.yy.FactoryMethod.Calculator;

public class DivOperatorFactory implements OperatorFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
