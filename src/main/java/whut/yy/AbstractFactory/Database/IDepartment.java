package whut.yy.AbstractFactory.Database;

//模拟对部门表的操作
public interface IDepartment {

    void insert(Department department);
    Department find(int id);
}
