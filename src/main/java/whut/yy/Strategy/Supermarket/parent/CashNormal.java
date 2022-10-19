package whut.yy.Strategy.Supermarket.parent;


import whut.yy.Strategy.Supermarket.base.CashSuper;

public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double originalMoney) {
        return originalMoney;
    }
}
