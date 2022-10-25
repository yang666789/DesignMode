package whut.yy.State.WriteProgram;

//下午工作状态
public class AfternoonState implements State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 17) {
            System.out.println("当前时间：" + w.getHour() + "点 下午状态还不错，继续努力");
        } else {
            w.setCurrentState(new EveningState());
            w.writeProgram();
        }
    }
}
