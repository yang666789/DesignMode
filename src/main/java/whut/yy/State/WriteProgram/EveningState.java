package whut.yy.State.WriteProgram;

//晚间状态
public class EveningState implements State {
    @Override
    public void writeProgram(Work w) {
        if (w.isFinish()) {//工作完成
            w.setCurrentState(new RestState());
            w.writeProgram();
        } else {
//            if (w.getHour() < 21) {
//                System.out.println("当前时间：" + w.getHour() + "点 加班哦，疲累至极");
//            } else {
//                w.setCurrentState(new SleepingState());
//                w.writeProgram();
//            }

            //添加八点强制下班状态
            if (w.getHour() < 20) {
                System.out.println("当前时间：" + w.getHour() + "点 加班哦，疲累至极");
            } else {
                w.setCurrentState(new ForcedOffDutyState());
                w.writeProgram();
            }
        }
    }
}
