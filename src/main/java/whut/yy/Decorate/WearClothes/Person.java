package whut.yy.Decorate.WearClothes;

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
