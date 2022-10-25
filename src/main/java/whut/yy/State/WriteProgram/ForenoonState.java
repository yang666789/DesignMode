package whut.yy.State.WriteProgram;

//早上工作状态
public class ForenoonState implements State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 12) {
            System.out.println("当前时间：" + w.getHour() + "点 上午工作，精神百倍");
        }else {
            w.setCurrentState(new NoonState());
            w.writeProgram();
        }
    }
}
