package whut.yy.AbstractFactory.Database;

public class MySQLDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在MySQL中给Department表插入一个部门:" + department.getDeptName());
    }

    @Override
    public Department find(int id) {
        System.out.println("在MySQL中根据ID得到Department表一条记录");
        return null;
    }
}
