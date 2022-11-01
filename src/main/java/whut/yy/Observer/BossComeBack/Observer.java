package whut.yy.Observer.BossComeBack;

import lombok.Getter;
import lombok.Setter;

//抽象观察者
public abstract class Observer {
    protected String name;
    protected Subject sub;//观察者记录此通知者，让该通知者通知我
    @Getter
    @Setter
    protected String subjectState;//观察者状态，要与通知者状态一致

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
