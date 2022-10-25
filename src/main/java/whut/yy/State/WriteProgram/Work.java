package whut.yy.State.WriteProgram;

import lombok.Getter;
import lombok.Setter;

//工作类
//存储时间，根据时间来改变状态
public class Work {
    @Setter
    private State currentState;
    @Getter
    @Setter
    private double hour;//时间，状态转换依据
    @Getter
    @Setter
    private boolean finish = false;//是否完成工作

    public Work() {
        this.currentState = new ForenoonState();//早上9点开始上班
    }

    public void writeProgram() {
        currentState.writeProgram(this);
    }
}
