package whut.yy.Mediator.Peace;

//美国
public class USA extends Country {
    public USA(UnitedNations mediator) {
        super(mediator);
    }

    //声明
    public void declare(String message) {
        this.mediator.declare(message, this);//由中介者完成国家之间的交流
    }

    //接收消息
    public void getMessage(String message) {
        System.out.println("美国获得对方消息:" + message);
    }
}
