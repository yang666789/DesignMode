package whut.yy.State.WriteProgram;

public class SleepingState implements State{
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + "点 不行了，睡着了。");
    }
}
