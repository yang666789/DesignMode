package whut.yy.FactoryMethod.Calculator;

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
