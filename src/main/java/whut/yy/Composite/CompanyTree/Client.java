package whut.yy.Composite.CompanyTree;

public class Client {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany huadong = new ConcreteCompany("上海华东分公司");
        huadong.add(new HRDepartment("华东公司人力资源部"));
        huadong.add(new FinanceDepartment("华东公司财务部"));
        root.add(huadong);

        ConcreteCompany nanjin = new ConcreteCompany("南京办事处");
        nanjin.add(new HRDepartment("南京办事处人力资源部"));
        nanjin.add(new FinanceDepartment("南京办事处财务部"));
        huadong.add(nanjin);

        ConcreteCompany hangzhou = new ConcreteCompany("杭州办事处");
        hangzhou.add(new HRDepartment("杭州办事处人力资源部"));
        hangzhou.add(new FinanceDepartment("杭州办事处财务部"));
        huadong.add(hangzhou);

        System.out.println("结构图：");
        root.display(1);

        System.out.println("职责:");
        root.lineOfDuty();

    }
}
