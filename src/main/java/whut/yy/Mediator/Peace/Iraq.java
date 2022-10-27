package whut.yy.Mediator.Peace;

//伊拉克
public class Iraq extends Country {
    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    //声明
    public void declare(String message) {
        this.mediator.declare(message, this);//由中介者完成国家之间的交流
    }

    //接收消息
    public void getMessage(String message) {
        System.out.println("伊拉克获得对方消息:" + message);
    }
}
