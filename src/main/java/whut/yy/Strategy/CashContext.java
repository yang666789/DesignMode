package whut.yy.Strategy;


import whut.yy.Strategy.base.CashSuper;
import whut.yy.Strategy.parent.CashNormal;
import whut.yy.Strategy.parent.CashRebate;
import whut.yy.Strategy.parent.CashReturn;

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