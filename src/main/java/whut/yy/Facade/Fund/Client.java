package whut.yy.Facade.Fund;

//客户只需知道基金即可，不需要知道股票等其他投资方式
//让基金帮你赚钱
public class Client {
    public static void main(String[] args) {
        Fund fund = new Fund();

        fund.buyFund1();
        fund.sellFund1();
    }
}
