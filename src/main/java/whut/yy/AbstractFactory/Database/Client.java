package whut.yy.AbstractFactory.Database;

import whut.yy.AbstractFactory.Database.EasyFactory.DataAccess;

public class Client {
    public static void main(String[] args) {
        User user = new User(1, "张三");
        Department department = new Department(1, "开发部");

        //region 抽象工厂模式：新增产品系列容易，增加新产品难
//        IFactory factory = new SQLServerFactory();
//        IFactory factory = new MySQLFactory();
//
//        IUser iUser = factory.createUser();
//        iUser.insert(user);
//        iUser.find(1);
//
//        IDepartment iDepartment = factory.createDepartment();
//        iDepartment.insert(department);
//        iDepartment.find(1);
        //endregion

        //region 简单工厂模式改造
        IUser iUser = DataAccess.createUser();
        iUser.insert(user);
        iUser.find(1);

        IDepartment iDepartment = DataAccess.createDepartment();
        iDepartment.insert(department);
        iDepartment.find(1);
        //endregion
    }
}
