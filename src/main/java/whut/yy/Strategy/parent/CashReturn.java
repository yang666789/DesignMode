package whut.yy.Strategy.parent;


import whut.yy.Strategy.base.CashSuper;

public class CashReturn extends CashSuper {

    private double condition;//满多少
    private double returnMoney;//返多少

    public CashReturn(double condition, double returnMoney) {
        this.condition = condition;
        this.returnMoney = returnMoney;
    }

    @Override
    public double acceptCash(double originalMoney) {
        double result = originalMoney;
        if (originalMoney >= condition) {
            //向下取整
            result = originalMoney - Math.floor(originalMoney / condition) * returnMoney;
        }
        return result;
    }
}
