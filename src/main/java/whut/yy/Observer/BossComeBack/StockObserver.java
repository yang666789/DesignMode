package whut.yy.Observer.BossComeBack;

//具体观察者
public class StockObserver extends Observer {
    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        this.setSubjectState(this.sub.getSubjectState());//观察者状态和通知者状态一致
        System.out.println(this.sub.getSubjectState() + " " + this.name + " 关闭股票行情，继续工作！");
    }
}
