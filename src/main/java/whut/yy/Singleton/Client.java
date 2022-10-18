package whut.yy.Singleton;

public class Client {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();
        s1.setName("yy");

        MySingleton s2 = MySingleton.getInstance();
        s2.setName("java");

        System.out.println("s1的名字：" + s1.getName());
        System.out.println("s2的名字：" + s2.getName());

        if (s1 == s2) {
            System.out.println("创建的是同一个实例");
        } else {
            System.out.println("创建的不是同一个实例");
        }

    }
}
