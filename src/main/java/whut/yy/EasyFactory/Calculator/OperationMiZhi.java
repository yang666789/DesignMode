package whut.yy.EasyFactory.Calculator;

/**
 * 幂指函数：底数和指数都为变量
 */
public class OperationMiZhi extends Operation {

    @Override
    public double getResult() {
        return Math.pow(getNumberA(), getNumberB());
    }
}
