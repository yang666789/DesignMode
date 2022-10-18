package whut.yy.AbstractFactory.Database.EasyFactory;

import whut.yy.AbstractFactory.Database.IDepartment;
import whut.yy.AbstractFactory.Database.IUser;
import whut.yy.Utils.ConfigUtil;

import java.lang.reflect.Constructor;

//简单工厂+反射
public class DataAccess {
    private static final String packageName = "whut.yy.AbstractFactory.Database";

    //    private static String db = "SQLServer";
    //    private static String db = "MySQL";
    //改造从配置文件中获取配置
    private static final String db = ConfigUtil.getConfigProperty("AbstractFactory.Database.DB");

    public static IUser createUser() {
        IUser iUser = null;
//        switch (db) {
//            case "SQLServer":
//                iUser = new SQLServerUser();
//                break;
//            case "MySQL":
//                iUser = new MySQLUser();
//                break;
//        }

        //region 简单工厂+反射
        try {
            Class<?> iUserClass = Class.forName(packageName + "." + db + "User");
            Constructor<?> constructor = iUserClass.getDeclaredConstructor();
            iUser = (IUser) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //endregion

        return iUser;
    }

    public static IDepartment createDepartment() {
        IDepartment iDepartment = null;
//        switch (db) {
//            case "SQLServer":
//                iDepartment = new SQLServerDepartment();
//                break;
//            case "MySQL":
//                iDepartment = new MySQLDepartment();
//                break;
//        }

        //region 简单工厂+反射
        try {
            Class<?> iDepartmentClass = Class.forName(packageName + "." + db + "Department");
            Constructor<?> constructor = iDepartmentClass.getDeclaredConstructor();
            iDepartment = (IDepartment) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //endregion

        return iDepartment;
    }
}
