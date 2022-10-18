package whut.yy.AbstractFactory.Database;

//抽象工厂:必须包含生成各个抽象产品的方法
//让具体工厂的子类决定实例化哪一个类
public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}
