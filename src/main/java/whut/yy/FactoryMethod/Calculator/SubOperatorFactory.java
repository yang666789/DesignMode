package whut.yy.FactoryMethod.Calculator;

public class SubOperatorFactory implements OperatorFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
