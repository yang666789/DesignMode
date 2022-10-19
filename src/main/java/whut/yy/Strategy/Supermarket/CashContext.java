package whut.yy.Strategy.Supermarket;


import whut.yy.Strategy.Supermarket.base.CashSuper;
import whut.yy.Strategy.Supermarket.parent.CashNormal;
import whut.yy.Strategy.Supermarket.parent.CashRebate;
import whut.yy.Strategy.Supermarket.parent.CashReturn;

public class CashContext {
    private CashSuper cashSuper;

    //策略模式结合简单工厂模式
    public CashContext(String mode) {
        switch (mode) {
            case "原价":
                cashSuper = new CashNormal();
                break;
            case "打8折":
                cashSuper = new CashRebate(8);
                break;
            case "满300减100":
                cashSuper = new CashReturn(300, 100);
                break;
        }
    }

    public double getResult(double originalMoney) {
        return cashSuper.acceptCash(originalMoney);
    }
}