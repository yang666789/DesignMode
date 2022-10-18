package whut.yy.EasyFactory.Calculator;

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
