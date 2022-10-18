package whut.yy.Visitor.Example;

/**
 * 稳定的数据结构，其下具体类结构稳定
 */
public interface Element {

    void accept(Visitor visitor);
}
