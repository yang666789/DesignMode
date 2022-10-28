package whut.yy.Command.Barbecue;

public class Client {
    public static void main(String[] args) {
        //初始化烧烤小店
        Barbecuer barbecuer = new Barbecuer();
        BakeMuttonCommand muttonCommand1 = new BakeMuttonCommand(barbecuer);
        BakeMuttonCommand muttonCommand2 = new BakeMuttonCommand(barbecuer);
        BakeChickenWingCommand chickenWingCommand = new BakeChickenWingCommand(barbecuer);
        Waiter girl = new Waiter();

        //营业，顾客点单
        girl.setOrder(muttonCommand1);
        girl.setOrder(muttonCommand2);
        girl.setOrder(chickenWingCommand);
        girl.cancelOrder(muttonCommand2);

        //点菜完毕，通知厨房
        //订单下好，一次通知
        girl.executeOrder();
    }
}
