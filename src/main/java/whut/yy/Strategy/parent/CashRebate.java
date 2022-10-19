package whut.yy.Strategy.parent;


import whut.yy.Strategy.base.CashSuper;

public class CashRebate extends CashSuper {

    //折扣
    private double discount;

    public CashRebate(double discount) {
        this.discount = discount;
    }

    @Override
    public double acceptCash(double originalMoney) {
        return originalMoney * discount * 0.1;
    }
}
