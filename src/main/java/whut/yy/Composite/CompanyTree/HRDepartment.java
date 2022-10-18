package whut.yy.Composite.CompanyTree;

/**
 * 人力资源部(叶子)
 * 叶子的添加和移除是空实现，采用的是透明方式
 * 使叶结点和枝节点对于外界没有区别
 */
public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    //空实现
    @Override
    public void add(Company c) {

    }

    //空实现
    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + this.name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.name + " 员工招聘培训管理");
    }
}
