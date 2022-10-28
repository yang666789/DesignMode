package whut.yy.Command.Barbecue;

public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        this.receiver.bakeChickenWing();//真正执行命令的是命令接收者
    }
}
