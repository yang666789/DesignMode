package whut.yy.State.WriteProgram;

//中午工作状态
public class NoonState implements State{
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 13) {
            System.out.println("当前时间：" + w.getHour() + "点 饿了，午饭；犯困，午休。");
        }else {
            w.setCurrentState(new AfternoonState());
            w.writeProgram();
        }
    }
}
