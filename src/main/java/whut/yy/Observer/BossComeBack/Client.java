package whut.yy.Observer.BossComeBack;

public class Client {
    public static void main(String[] args) {
        Subject boss = new Boss();

        //同事要知道是老板负责通知他们
        //看股票的同事
        Observer workMate1 = new StockObserver("乔尼·乔斯达", boss);
        //看NBA的同事
        Observer workMate2 = new NBAObserver("杰洛·齐贝林", boss);

        //老板要知道该被通知的人
        boss.attach(workMate1);
        boss.attach(workMate2);

//        boss.detach(workMate1);

        //老板回来
        boss.setSubjectState("我是老板，我回来了！");
        //发出通知
        boss.notifyAllObservers();
    }
}
