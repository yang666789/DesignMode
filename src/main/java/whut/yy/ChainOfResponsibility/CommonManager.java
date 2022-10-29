package whut.yy.ChainOfResponsibility;

public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        //经理所持有的权限是可批准下属有两天内的假期
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 2) {
            System.out.println(this.name + "：" + request.getRequestContent()
                    + " 数量" + request.getNumber() + "被批准");
        } else {
            if (this.superior != null)
                this.superior.requestApplications(request);//其余申请转到上级
        }
    }
}
