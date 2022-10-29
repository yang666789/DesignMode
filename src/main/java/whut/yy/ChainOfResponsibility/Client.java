package whut.yy.ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Manager jingli = new CommonManager("经理");
        Manager zongjian = new Majordomo("总监");
        Manager zongjingli = new GeneralManager("总经理");

        //设置职责链结构
        jingli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(1);
        jingli.requestApplications(request);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(4);
        jingli.requestApplications(request2);

        Request request3 = new Request();
        request3.setRequestType("请假");
        request3.setRequestContent("小菜请假");
        request3.setNumber(10);
        jingli.requestApplications(request3);

        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("小菜加薪");
        request4.setNumber(488);
        jingli.requestApplications(request4);

        Request request5 = new Request();
        request5.setRequestType("加薪");
        request5.setRequestContent("小菜加薪");
        request5.setNumber(888);
        jingli.requestApplications(request5);//客户端不用认识总监、总经理
    }
}
