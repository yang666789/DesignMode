package whut.yy.Strategy.parent;


import whut.yy.Strategy.base.CashSuper;

public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double originalMoney) {
        return originalMoney;
    }
}
