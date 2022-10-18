package whut.yy.Visitor.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构类：针对不同访问者遍历各个元素，得到不同的反应
 * 允许访问者访问它的元素
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element e : elements) {
            e.accept(visitor);
        }
    }
}
