package whut.yy.Flyweight.WebSiteShare;

import java.util.HashMap;

public class WebSiteFactory {
    private HashMap<String, WebSite> flyweights = new HashMap<>();

    //获得网站分类
    public WebSite getWebSiteCategory(String key) {
        if (!this.flyweights.containsKey(key))
            this.flyweights.put(key, new ConcreteWebSite(key));
        return this.flyweights.get(key);
    }

    //获得网站分类总数（得到实例的个数）
    public int getWebSiteCount() {
        return this.flyweights.size();
    }

}
