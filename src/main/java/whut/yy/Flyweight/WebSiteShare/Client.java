package whut.yy.Flyweight.WebSiteShare;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite zs1 = factory.getWebSiteCategory("产品展示");
        zs1.Use(new User("小菜"));
        WebSite zs2 = factory.getWebSiteCategory("产品展示");
        zs2.Use(new User("大鸟"));
        WebSite zs3 = factory.getWebSiteCategory("产品展示");
        zs3.Use(new User("娇娇"));

        WebSite bk1 = factory.getWebSiteCategory("博客");
        bk1.Use(new User("承太郎"));
        WebSite bk2 = factory.getWebSiteCategory("博客");
        bk2.Use(new User("徐伦"));
        WebSite bk3 = factory.getWebSiteCategory("博客");
        bk3.Use(new User("东方定助"));

        System.out.println("网站分类总数为：" + factory.getWebSiteCount());
    }
}
