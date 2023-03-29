package whut.yy.Decorate.WearClothes;

/**
 * 装饰类（保留一个具体组件的引用）
 */
public class Finery extends Person {

    private Person component;

    public void decorate(Person component){
        this.component = component;
    }

    @Override
    public void show() {
        if (component!=null){
            component.show();
        }
    }
}
