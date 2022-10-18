package whut.yy.AbstractFactory.Database;

public class MySQLUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在MySQL中给User表插入一个用户:" + user.getName());
    }

    @Override
    public User find(int id) {
        System.out.println("在MySQL中根据ID得到User表一条记录");
        return null;
    }
}
