package whut.yy.Decorate.WearClothes;

/**
 * 具体组件（只有一个具体组件所以取消组件接口）
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("爱穿搭的" + this.name);
    }
}
