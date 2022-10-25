package whut.yy.State.WriteProgram;

public class ForcedOffDutyState implements State{
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + "点 快走！快走！下班了！再不走门锁了！");
    }
}
