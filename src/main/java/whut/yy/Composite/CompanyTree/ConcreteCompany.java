package whut.yy.Composite.CompanyTree;

import java.util.ArrayList;
import java.util.List;

//具体公司
//相当于树枝
public class ConcreteCompany extends Company {
    private List<Company> children;

    public ConcreteCompany(String name) {
        super(name);
        children = new ArrayList<>();
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + this.name);
        for (Company company : children) {
            company.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : children) {
            company.lineOfDuty();
        }
    }
}
