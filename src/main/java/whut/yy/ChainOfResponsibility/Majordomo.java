package whut.yy.ChainOfResponsibility;

public class Majordomo extends Manager {
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        //总监所持有的权限是可批准下属有五天内的假期
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 5) {
            System.out.println(this.name + "：" + request.getRequestContent()
                    + " 数量" + request.getNumber() + "被批准");
        } else {
            if (this.superior != null)
                this.superior.requestApplications(request);//其余申请转到上级
        }
    }
}
