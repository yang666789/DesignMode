package whut.yy.ChainOfResponsibility;

public abstract class Manager {
    protected String name;

    protected Manager superior;//管理者的上级

    public Manager(String name) {
        this.name = name;
    }

    //设置管理者的上级
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);//申请请求
}
