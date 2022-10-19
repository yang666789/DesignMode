package whut.yy.Strategy.Supermarket;

public class Client {
    public static void main(String[] args) {
//        CashContext context = new CashContext("原价");
//        CashContext context = new CashContext("打8折");
        CashContext context = new CashContext("满300减100");
        System.out.println("优惠后价格为:" + context.getResult(600));
    }
}
