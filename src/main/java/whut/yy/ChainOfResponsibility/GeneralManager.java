package whut.yy.ChainOfResponsibility;

public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        //总经理可批准下属有任意天的假期
        if ("请假".equals(request.getRequestType())) {
            System.out.println(this.name + "：" + request.getRequestContent()
                    + " 数量" + request.getNumber() + "被批准");
        }
        //可批准下属有500内的加薪
        else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 500) {
            System.out.println(this.name + "：" + request.getRequestContent()
                    + " 数量" + request.getNumber() + "被批准");
        }
        //超过500需要考虑
        else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 500) {
            System.out.println(this.name + "：" + request.getRequestContent()
                    + " 数量" + request.getNumber() + "再说吧！");
        }
    }
}
