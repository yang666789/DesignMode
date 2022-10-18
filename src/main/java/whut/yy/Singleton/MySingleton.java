package whut.yy.Singleton;

import lombok.Getter;
import lombok.Setter;

//由类本身来管理自己的唯一实例
@Getter
@Setter
public class MySingleton {
    private String name;
    private static volatile MySingleton singleton = null;

    //构造方法私有化
    private MySingleton() {
    }

    //懒汉式获取唯一实例
    public static MySingleton getInstance() {
        //双重检查锁定，保证线程安全
        if (singleton == null) {
            synchronized (MySingleton.class) {
                if (singleton == null) {
                    singleton = new MySingleton();
                }
            }
        }
        return singleton;
    }
}
