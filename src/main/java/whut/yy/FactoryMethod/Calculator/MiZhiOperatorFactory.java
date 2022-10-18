package whut.yy.FactoryMethod.Calculator;

public class MiZhiOperatorFactory implements OperatorFactory {
    @Override
    public Operation createOperation() {
        return new OperationMiZhi();
    }
}
