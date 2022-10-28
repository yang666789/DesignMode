package whut.yy.Command.Barbecue;

public class BakeMuttonCommand extends Command{
    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        this.receiver.bakeMutton();//真正执行命令的是命令接收者
    }
}
