package whut.yy.AbstractFactory.Database;

//具体工厂
public class SQLServerFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new SQLServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SQLServerDepartment();
    }
}
