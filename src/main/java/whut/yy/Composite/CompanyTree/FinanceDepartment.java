package whut.yy.Composite.CompanyTree;

/**
 * 财政部(叶子)
 * 叶子的添加和移除是空实现，采用的是透明方式
 * 使叶结点和枝节点对于外界没有区别
 */
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + this.name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.name + " 公司财务收支管理");
    }
}
