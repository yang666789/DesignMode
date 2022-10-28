package whut.yy.Command.Barbecue;

import whut.yy.Utils.TimeUtil;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

//命令调用者（发布命令的）
public class Waiter {
    private List<Command> commandList = new LinkedList<>();

    //设置订单
    public void setOrder(Command command) {
        //在客户提出请求时，对没货的烧烤进行回绝
        if ("whut.yy.Command.Barbecue.BakeChickenWingCommand".equals(command.getClass().getName())) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤。");
        } else {
            this.commandList.add(command);
            //记录客户所点的烧烤的日志，以备算账收钱
            System.out.println("增加订单：" + command
                    + " 时间：" + TimeUtil.getCurTime(new Date()));
        }
    }

    //取消订单
    public void cancelOrder(Command command) {
        this.commandList.remove(command);
        //记录客户取消的烧烤的日志，以备算账收钱
        System.out.println("取消订单：" + command
                + " 时间：" + TimeUtil.getCurTime(new Date()));
    }

    //通知全部执行
    public void executeOrder() {
        for (Command command : this.commandList) {
            command.executeCommand();
        }
    }
}
