package whut.yy.Composite.CompanyTree;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Company {
    protected String name;

    public abstract void add(Company c);//增加
    public abstract void remove(Company c);//减少
    public abstract void display(int depth);//显示
    public abstract void lineOfDuty();//履行职责
}
