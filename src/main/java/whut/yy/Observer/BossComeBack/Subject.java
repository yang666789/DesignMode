package whut.yy.Observer.BossComeBack;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

//抽象通知者
public abstract class Subject {
    protected List<Observer> observers = new LinkedList<>();
    @Getter
    @Setter
    protected String subjectState;//通知者状态

    //增加观察者
    public void attach(Observer o) {
        this.observers.add(o);
    }

    //移除观察者
    public void detach(Observer o) {
        this.observers.remove(o);
    }

    //状态改变，通知者通知所有观察者改变状态
    public void notifyAllObservers() {
        observers.forEach(Observer::update);
    }
}
