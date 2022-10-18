package whut.yy.FactoryMethod.Calculator;

public class MulOperatorFactory implements OperatorFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
