package whut.yy.Flyweight.WebSiteShare;

public class ConcreteWebSite implements WebSite {
    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void Use(User user) {
        System.out.println("网站分类：" + this.name + " 用户：" + user.getName());
    }
}
