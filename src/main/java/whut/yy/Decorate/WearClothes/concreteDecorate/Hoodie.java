package whut.yy.Decorate.WearClothes.concreteDecorate;

import whut.yy.Decorate.WearClothes.Finery;

/**
 * 具体装饰类
 */
public class Hoodie extends Finery {

    @Override
    public void show() {
        System.out.print("卫衣 ");
        super.show();
    }
}
