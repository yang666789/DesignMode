package whut.yy.AbstractFactory.Database;

//模拟对用户表的操作
public interface IUser {

    void insert(User user);
    User find(int id);
}
