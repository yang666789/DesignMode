package whut.yy.State.WriteProgram;

//下班休息状态
public class RestState implements State{
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + "点 下班回家了");
    }
}
