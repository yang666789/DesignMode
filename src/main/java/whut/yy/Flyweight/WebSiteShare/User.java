package whut.yy.Flyweight.WebSiteShare;

import lombok.Getter;

//是享元模式中的外部状态，共享实例中的不同点
public class User {
    @Getter
    private String name;

    public User(String name) {
        this.name = name;
    }
}
