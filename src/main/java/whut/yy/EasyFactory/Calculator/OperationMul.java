package whut.yy.EasyFactory.Calculator;

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
